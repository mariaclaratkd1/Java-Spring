package com.example.Java13.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Java13.model.Usuariomodel;
import com.example.Java13.service.UsuarioService;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuariomodel> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public ResponseEntity<Usuariomodel> salvarUsuario(Usuariomodel usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.status (HttpStatus.CREATED).body(usuario);
    }

}
