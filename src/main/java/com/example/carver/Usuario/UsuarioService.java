package com.example.carver.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    //Inyeccion de dependencias
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }
    public void addNewUsuario(Usuario usuario) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(usuario.getEmail());
        if(usuarioOptional.isPresent()){
            throw new IllegalStateException("Email ya registrado");
        }
        usuarioRepository.save(usuario);
    }
    public void deleteUsuario(int usuarioId) {
        boolean exists = usuarioRepository.existsById(usuarioId);
        if(!exists){
            throw new IllegalStateException("Usuario con id " + usuarioId + " no existe");
        }
        usuarioRepository.deleteById(usuarioId);
    }
}
