package io.gitHub.AugustoMello09.cargaFila.backend.entities;

import io.gitHub.AugustoMello09.cargaFila.backend.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    @Column(name = "USU_ID")
    private UUID id;

    @Column(name = "USU_NAME", nullable = false)
    private String name;

    @Column(name = "USU_EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "USU_TELEPHONE", nullable = false, unique = true)
    private String telephone;

    @Column(name = "USU_PASSWORD", nullable = false)
    private String password;

    @Column(name = "USU_AUTHORITY", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role authority;
}
