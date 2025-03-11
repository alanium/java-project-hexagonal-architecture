package com.example.application.service.user;

import com.example.domain.model.User;
import com.example.infrastructure.ports.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GetUserUseCase {

    private final UserRepositoryPort userRepository;

    public GetUserUseCase(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(UUID userId) {
        return userRepository.findById(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
