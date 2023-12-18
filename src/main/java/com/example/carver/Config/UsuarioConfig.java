package com.example.carver.Config;

import com.example.carver.Models.Usuario;
import com.example.carver.Repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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