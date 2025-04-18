package io.gitHub.AugustoMello09.cargaFila.backend.services.servicesImpl;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.entity.User;
import io.gitHub.AugustoMello09.cargaFila.backend.enums.Role;
import io.gitHub.AugustoMello09.cargaFila.backend.mappers.UserMapper;
import io.gitHub.AugustoMello09.cargaFila.backend.repositories.UserRepository;
import io.gitHub.AugustoMello09.cargaFila.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDTO save(UserInsertRequestDTO request) {
        User user = userMapper.toEntity(request);
        user.setAuthority(Role.CLIENT);
        return userMapper.toDto(userRepository.save(user));
    }
}
