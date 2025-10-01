package com.example.Java13.service;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.Java13.model.Usuariomodel;
import com.example.Java13.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuariomodel> getAllUsers() {
        return usuarioRepository.findAll();
    }

    public Usuariomodel salvarUsuario (Usuariomodel usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
                throw new RuntimeException("Email já cadastrado");      
        }
        return usuarioRepository.save(usuario);
    }

    public Usuariomodel atualizarUsuario (UUID id, Usuariomodel usuario) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario (UUID id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(id);
    }

    public List<Usuariomodel> listarUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarUsuarios'");
    }   
}
