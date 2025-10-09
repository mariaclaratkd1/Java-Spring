package com.example.Java14.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Java14.model.UsuarioModel;
import com.example.Java14.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List <UsuarioModel>listarTodos() {
        return service.listarTodos();
    }
    
    @PostMapping
    public ResponseEntity <Map<String, Object>> salvar(@RequestBody UsuarioModel usuario) {
        service.salvar(usuario);
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(Map.of("mensagem", "Cadastrado com sucesso"));
    }

}
