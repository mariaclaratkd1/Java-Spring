package com.example.Java09.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.Java09.model.Funcionario;
import com.example.Java09.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }
    @PostMapping
    public ResponseEntity <Funcionario> salvar (@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }

    @PutMapping
    public ResponseEntity<Funcionario> atualizar (@RequestBody Funcionario funcionario){
        Funcionario usuarioAtualizado = funcionarioRepository.save(funcionario);
        return ResponseEntity.ok(usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        funcionarioRepository.deleteAllById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
