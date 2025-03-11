package com.example.infrastructure.configuration;

import com.example.application.service.user.GetUserUseCase;
import com.example.infrastructure.ports.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public GetUserUseCase getUserUseCase(UserRepositoryPort userRepositoryPort) {
        return new GetUserUseCase(userRepositoryPort);
    }
}
