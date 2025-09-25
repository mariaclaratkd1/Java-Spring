package com.example.Exercicio.repository;

import com.example.Exercicio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String> {
    Optional<Usuario> findByemail (String email);
}
