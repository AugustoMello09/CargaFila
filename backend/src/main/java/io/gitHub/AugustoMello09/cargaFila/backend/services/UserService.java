package io.gitHub.AugustoMello09.cargaFila.backend.services;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;

public interface UserService {
    UserResponseDTO save(UserInsertRequestDTO requestDTO);
}
