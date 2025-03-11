package com.example.infrastructure.ports;

import com.example.domain.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryPort {
    Optional<User> findById(UUID id);
    User save(User user);
    List<User> findAll();
    void deleteById(UUID id);

}
