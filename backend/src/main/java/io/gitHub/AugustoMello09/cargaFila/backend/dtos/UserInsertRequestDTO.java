package io.gitHub.AugustoMello09.cargaFila.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInsertRequestDTO {

    private String name;
    private String email;
    private String telephone;
    private String password;
}
