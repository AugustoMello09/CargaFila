package io.gitHub.AugustoMello09.cargaFila.backend.mappers;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Named("toEntity")
    User toEntity(UserInsertRequestDTO requestDTO);

    @Named("toDTO")
    UserResponseDTO toDto(User user);
}
