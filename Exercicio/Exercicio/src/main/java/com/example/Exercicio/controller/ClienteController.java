package com.example.Exercicio.controller;

import com.example.Exercicio.model.Cliente;
import com.example.Exercicio.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvarCLiente (@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
}
