package com.example.Exercicio.repository;

import com.example.Exercicio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Optional<Cliente> findByprotocoloAtendimento (String protocoloAtendimento);
}
