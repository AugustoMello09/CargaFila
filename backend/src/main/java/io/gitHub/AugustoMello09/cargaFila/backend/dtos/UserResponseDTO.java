package io.gitHub.AugustoMello09.cargaFila.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserResponseDTO {

    private UUID id;
    private String name;
    private String email;
    private String telephone;
}
