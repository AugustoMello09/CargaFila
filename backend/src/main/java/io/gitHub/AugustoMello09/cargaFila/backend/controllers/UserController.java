package io.gitHub.AugustoMello09.cargaFila.backend.controllers;

import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserInsertRequestDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.dtos.UserResponseDTO;
import io.gitHub.AugustoMello09.cargaFila.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> save(@RequestBody UserInsertRequestDTO request) {
        UserResponseDTO responseDTO = userService.save(request);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                        .buildAndExpand(responseDTO.getId()).toUri())
                .body(responseDTO);
    }
}
