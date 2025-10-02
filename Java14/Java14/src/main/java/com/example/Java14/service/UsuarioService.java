package com.example.Java14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Java14.model.UsuarioModel;
import com.example.Java14.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioModel> listarTodos() {
        return repository.findAll();
    }

    public UsuarioModel salvar(UsuarioModel usuario) {
        if (repository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return repository.save(usuario);
    }
}
