package com.example.Java12.service;

import com.example.Java12.model.Cliente;
import com.example.Java12.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }
    public Cliente salvar (Cliente cliente){
        if (clienteRepository.findByemail(cliente.getEmail()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado.");
        }
        return clienteRepository.save(cliente);
    }
    public Cliente atualizar(UUID id, Cliente cliente){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");
        }
        cliente.setId(id);
        Cliente clienteAtualizado = clienteRepository.save(cliente);
        return clienteAtualizado;
    }
    public void excluir (UUID id){
        if (clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");
        }
        clienteRepository.deleteById(id);
    }
}