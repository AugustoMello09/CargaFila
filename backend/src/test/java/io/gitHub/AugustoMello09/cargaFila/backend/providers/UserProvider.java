package io.gitHub.AugustoMello09.cargaFila.backend.providers;

import io.gitHub.AugustoMello09.cargaFila.backend.entities.User;
import io.gitHub.AugustoMello09.cargaFila.backend.enums.Role;

import java.util.UUID;

public class UserProvider {

    private static final UUID ID = UUID.fromString("148cf4fc-b379-4e25-8bf4-f73feb06befa");
    private static final String NAME = "José";
    private static final String EMAIL = "meuEmail@gmail.com";
    private static final String PASSWORD = "1234";
    private static final String TELEPHONE = "18997282497";

    public User create() {
        User user = new User();
        user.setId(ID);
        user.setName(NAME);
        user.setEmail(EMAIL);
        user.setTelephone(TELEPHONE);
        user.setPassword(PASSWORD);
        user.setAuthority(Role.CLIENT);
        return user;
    }
}
