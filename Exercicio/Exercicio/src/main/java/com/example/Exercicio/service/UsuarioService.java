package com.example.Exercicio.service;

import com.example.Exercicio.model.Usuario;
import com.example.Exercicio.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario salvar (Usuario usuario){
        if (usuarioRepository.findByemail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Usuário já cadastrado.");
        }
        return usuarioRepository.save(usuario);
    }
}
