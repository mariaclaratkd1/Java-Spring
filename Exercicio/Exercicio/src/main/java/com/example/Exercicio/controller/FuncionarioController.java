package com.example.Exercicio.controller;

import com.example.Exercicio.model.Funcionario;
import com.example.Exercicio.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/funcionario")
@RestController
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController (FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios(){
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvarFuncionarios (@RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
