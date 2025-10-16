package com.example.Java16.service;

import com.example.Java16.dto.UsuarioRequestDTO;
import com.example.Java16.dto.UsuarioResponseDTO;
import com.example.Java16.model.UsuarioModel;
import com.example.Java16.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<UsuarioResponseDTO> listarTodos(){
        return usuarioRepository
                .findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    public UsuarioModel salvarUsuario (UsuarioRequestDTO usuarioRequestDTO){
        if(usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado.");
        }

        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(usuarioRequestDTO.getNome());
        novoUsuario.setEmail(usuarioRequestDTO.getEmail());

        novoUsuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(novoUsuario);
        return novoUsuario;
    }

    public UsuarioModel atualizarUsuario (Long id, UsuarioRequestDTO usuarioRequestDTO){
        if (!usuarioRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");
        }

        UsuarioModel atualizarUsuario = new UsuarioModel();
        atualizarUsuario.setId(id);
        atualizarUsuario.setNome(usuarioRequestDTO.getNome());
        atualizarUsuario.setEmail(usuarioRequestDTO.getEmail());

        atualizarUsuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(atualizarUsuario);
        return atualizarUsuario;
    }

    public void excluirUsuario (Long id){
        if(!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado.");
        }
        usuarioRepository.deleteById(id);
    }
}
