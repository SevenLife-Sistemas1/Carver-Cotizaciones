package com.example.carver.Repositories;

import com.example.carver.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    //SELECT * FROM usuario WHERE id = ?
    @Override
    Optional<Usuario> findById(Long UserId);
    //SELECT * FROM usuario WHERE email = ?
    Optional<Usuario> findByEmail(String UserEmail);

}
