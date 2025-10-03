package com.example.Java14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Java14.exception.EmailCadastradoException;
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
            throw new EmailCadastradoException("Email já cadastrado");
        }
        return repository.save(usuario);
    }

    public UsuarioModel atualizar (Long id, UsuarioModel usuario) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        usuario.setId(id);
        return repository.save(usuario);
    }

    public void deletar (Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        repository.deleteById(id);
    }   
}
