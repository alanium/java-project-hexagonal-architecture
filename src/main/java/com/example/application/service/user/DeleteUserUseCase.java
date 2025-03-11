package com.example.application.service.user;

import com.example.infrastructure.ports.UserRepositoryPort;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DeleteUserUseCase {

    private final UserRepositoryPort userRepository;

    public DeleteUserUseCase(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(UUID userId) {
        userRepository.deleteById(userId);
    }
}
