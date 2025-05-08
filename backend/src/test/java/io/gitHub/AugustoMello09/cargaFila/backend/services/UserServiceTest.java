package io.gitHub.AugustoMello09.cargaFila.backend.services;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.entities.User;
import io.gitHub.AugustoMello09.cargaFila.backend.mappers.UserMapper;
import io.gitHub.AugustoMello09.cargaFila.backend.providers.UserInsertRequestDTOProvider;
import io.gitHub.AugustoMello09.cargaFila.backend.providers.UserProvider;
import io.gitHub.AugustoMello09.cargaFila.backend.providers.UserResponseDTOProvider;
import io.gitHub.AugustoMello09.cargaFila.backend.repositories.UserRepository;
import io.gitHub.AugustoMello09.cargaFila.backend.services.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    private static final UserProvider userProvider = new UserProvider();
    private static final UserResponseDTOProvider userResponseDtoProvider = new UserResponseDTOProvider();
    private static final UserInsertRequestDTOProvider userInsertRequestDtoProvider = new UserInsertRequestDTOProvider();

    @BeforeEach
    public void setUp() {
        userService = new UserServiceImpl(userRepository, userMapper);
    }

    @Test
    @DisplayName("Deve conseguir salvar um usuário com sucesso. ")
    public void shouldSaveUserWithSuccess() {
        User user = userProvider.create();
        UserResponseDTO userResponseDTO = userResponseDtoProvider.create();
        UserInsertRequestDTO userInsertRequestDTO = userInsertRequestDtoProvider.request();

        Mockito.when(userMapper.toEntity(Mockito.any(UserInsertRequestDTO.class))).thenReturn(user);
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(user);
        Mockito.when(userMapper.toDto(Mockito.any(User.class))).thenReturn(userResponseDTO);

        UserResponseDTO response = userService.save(userInsertRequestDTO);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(UserResponseDTO.class, response.getClass());
        Assertions.assertEquals(userResponseDTO.getId(), response.getId());
        Assertions.assertEquals(userResponseDTO.getName(), response.getName());
        Assertions.assertEquals(userResponseDTO.getEmail(), response.getEmail());
        Assertions.assertEquals(userResponseDTO.getTelephone(), response.getTelephone());

        Mockito.verify(userMapper, Mockito.times(1)).toEntity(userInsertRequestDTO);
        Mockito.verify(userRepository, Mockito.times(1)).save(Mockito.any(User.class));
        Mockito.verify(userMapper, Mockito.times(1)).toDto(user);
    }
}
