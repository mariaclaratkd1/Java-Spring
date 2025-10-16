package com.example.Java16.repository;

import com.example.Java16.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
    Optional<UsuarioModel> findByEmail (String email);
}
