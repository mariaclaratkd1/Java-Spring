package com.example.Exercicio2.repository;

import com.example.Exercicio2.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FucnionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> FIndByMatricula (String matricula);
}
