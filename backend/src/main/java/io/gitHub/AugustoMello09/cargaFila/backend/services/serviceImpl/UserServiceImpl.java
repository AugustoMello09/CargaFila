package io.gitHub.AugustoMello09.cargaFila.backend.services.serviceImpl;

import io.gitHub.AugustoMello09.cargaFila.backend.repositories.UserRepository;
import io.gitHub.AugustoMello09.cargaFila.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
}
