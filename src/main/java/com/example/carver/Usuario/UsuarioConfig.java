package com.example.carver.Usuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository repository) {
        return args -> {
            Usuario Admin = new Usuario(
                    "admin",
                    "456",
                    "789",
                    "admin@carver.com",
                    "1234"
            );
            Usuario ejem1 = new Usuario(
                    "angelin",
                    "456",
                    "789",
                    "angel@carver.com",
                    "1234"
            );
            //repository.saveAll(List.of(Admin, ejem1));
        };
    }
}