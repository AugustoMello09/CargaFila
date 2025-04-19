package io.gitHub.AugustoMello09.cargaFila.backend.providers;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;

public class UserInsertRequestDTOProvider {

    private static final String NAME = "José";
    private static final String EMAIL = "meuEmail@gmail.com";
    private static final String PASSWORD = "123";
    private static final String TELEPHONE = "18997282497";

    public UserInsertRequestDTO request() {
        UserInsertRequestDTO requestDTO = new UserInsertRequestDTO();
        requestDTO.setName(NAME);
        requestDTO.setEmail(EMAIL);
        requestDTO.setTelephone(TELEPHONE);
        requestDTO.setPassword(PASSWORD);
        return requestDTO;
    }
}
