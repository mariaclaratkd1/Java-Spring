package com.example.Exercicio.service;

import com.example.Exercicio.model.Cliente;
import com.example.Exercicio.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService (ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    //GET
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    //POST
    public Cliente salvar (Cliente cliente){
        if (clienteRepository.findByprotocoloAtendimento(cliente.getProtocoloAtendimento()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado.");
        }
        return clienteRepository.save(cliente);
    }
}
