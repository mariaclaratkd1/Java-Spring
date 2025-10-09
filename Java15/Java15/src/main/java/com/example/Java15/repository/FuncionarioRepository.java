package com.example.Java15.repository;

import com.example.Java15.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository  extends JpaRepository <FuncionarioModel, Long> {
    Optional<FuncionarioModel> findByEmail (String email);
}
