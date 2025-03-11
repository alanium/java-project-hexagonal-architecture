package com.example.application.service.user;

import com.example.domain.model.User;
import com.example.infrastructure.ports.UserRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {

    private final UserRepositoryPort userRepository;

    public CreateUserUseCase(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return userRepository.save(user);
    }
}
