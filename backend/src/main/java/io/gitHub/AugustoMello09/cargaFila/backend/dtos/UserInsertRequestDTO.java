package io.gitHub.AugustoMello09.cargaFila.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInsertRequestDTO implements Serializable {

    private String name;
    private String email;
    private String telephone;
    private String password;
}
