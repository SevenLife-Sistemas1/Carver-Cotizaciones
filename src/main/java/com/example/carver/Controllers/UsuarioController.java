package com.example.carver.Controllers;

import com.example.carver.Models.Usuario;
import com.example.carver.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService UsuarioService) {
        this.usuarioService = UsuarioService;
    }
    //Obtiene todos los usuarios por medio de la url localhost:8080/api/v1/usuarios
    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }
    //Registra un nuevo usuario por medio de la url localhost:8080/api/v1/usuarios
    @PostMapping
    public void registerNewUsuario(@RequestBody Usuario usuario){
                usuarioService.addNewUsuario(usuario);
    }
    //Obtiene un usuario por id por medio de la url localhost:8080/api/v1/usuarios/{id}
    @DeleteMapping(path = "{userId}")
    public void deleteUsuario(@PathVariable("userId") Long usuarioId){
        usuarioService.deleteUsuario(usuarioId);
    }

    @PutMapping(path = "{userId}")
    public void updateUsuario(
            @PathVariable("userId") Long usuarioId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String secondLastName,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String password){
        usuarioService.updateUsuario(usuarioId, name, lastName, secondLastName, email, password);
    }
}