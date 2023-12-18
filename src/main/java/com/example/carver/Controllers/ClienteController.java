package com.example.carver.Controllers;

import com.example.carver.Models.Cliente;
import com.example.carver.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService ClienteService) {
        this.clienteService = ClienteService;
    }
    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }
    @PostMapping
    public void registerNewCliente(@RequestBody Cliente cliente){
        clienteService.addNewCliente(cliente);
    }
    @DeleteMapping(path = "{clienteId}")
    public void deleteCliente(@PathVariable("clienteId") Long clienteId){
        clienteService.deleteCliente(clienteId);
    }
    @PutMapping(path = "{clienteId}")
    public void updateCliente(
            @PathVariable("clienteId") Long clienteId,
            @RequestParam(required = false) String razonSocial,
            @RequestParam(required = false) String rfc,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String phone){
            clienteService.updateCliente(clienteId, razonSocial, rfc, email, phone);
    }

}
