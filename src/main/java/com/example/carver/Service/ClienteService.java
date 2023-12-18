package com.example.carver.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.carver.Repositories.ClienteRepository;
import com.example.carver.Models.Cliente;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }
    public void addNewCliente(Cliente cliente) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(cliente.getClientId());
        if(clienteOptional.isPresent()){
            throw new IllegalStateException("Cliente ya registrado");
        }
        clienteRepository.save(cliente);
    }
    public void deleteCliente(Long clienteId) {
        boolean exists = clienteRepository.existsById(clienteId);
        if(!exists){
            throw new IllegalStateException("Cliente con id " + clienteId + " no existe");
        }
        clienteRepository.deleteById(clienteId);
    }
    @Transactional
    public void updateCliente(Long id, String razonSocial, String rfc, String email, String phone) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "Cliente con id " + id + " no existe"
        ));
        if(razonSocial != null && razonSocial.length() > 0 && !razonSocial.equals(cliente.getRazonSocial())){
            cliente.setRazonSocial(razonSocial);
        }
        if(rfc != null && rfc.length() > 0 && !rfc.equals(cliente.getRfc())){
            cliente.setRfc(rfc);
        }
        if(email != null && email.length() > 0 && !email.equals(cliente.getEmail())){
            cliente.setEmail(email);
        }
        if(phone != null && phone.length() > 0 && !phone.equals(cliente.getPhone())){
            cliente.setPhone(phone);
        }
    }
}
