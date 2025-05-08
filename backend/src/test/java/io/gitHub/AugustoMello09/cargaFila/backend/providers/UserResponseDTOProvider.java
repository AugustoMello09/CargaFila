package io.gitHub.AugustoMello09.cargaFila.backend.providers;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;

import java.util.UUID;

public class UserResponseDTOProvider {

    private static final UUID ID = UUID.fromString("148cf4fc-b379-4e25-8bf4-f73feb06befa");
    private static final String NAME = "José";
    private static final String EMAIL = "meuEmail@gmail.com";
    private static final String TELEPHONE = "18997282497";

    public UserResponseDTO create(){
        UserResponseDTO user = new UserResponseDTO();
        user.setId(ID);
        user.setName(NAME);
        user.setEmail(EMAIL);
        user.setTelephone(TELEPHONE);
        return user;
    }
}
