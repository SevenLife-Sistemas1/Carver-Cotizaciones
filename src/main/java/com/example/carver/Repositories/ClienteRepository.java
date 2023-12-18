package com.example.carver.Repositories;

import com.example.carver.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    @Override
    Optional<Cliente> findById(Long ClienteId);


}
