package com.example.Java11.repository;

import com.example.Java11.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {
    //consulta o banco e verifica se tem algum telefone cadastrado
    Optional<Funcionario> findBytelefone(String telefone);
}