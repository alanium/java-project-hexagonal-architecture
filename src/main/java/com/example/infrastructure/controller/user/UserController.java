package com.example.infrastructure.controller.user;

import com.example.application.service.user.GetUserUseCase;
import com.example.application.service.user.CreateUserUseCase;
import com.example.application.service.user.DeleteUserUseCase;
import com.example.domain.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final GetUserUseCase getUserUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    public UserController(GetUserUseCase getUserUseCase, CreateUserUseCase createUserUseCase, DeleteUserUseCase deleteUserUseCase) {
        this.getUserUseCase = getUserUseCase;
        this.createUserUseCase = createUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        deleteUserUseCase.execute(id);
    }


    @PostMapping
    public User createUser(@RequestBody User user) {
        return createUserUseCase.execute(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable UUID id) {
        return getUserUseCase.execute(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return getUserUseCase.getAllUsers();
    }
}
