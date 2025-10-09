package com.example.Java12.repository;

import com.example.Java12.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    //Pesquisar por um cliente sem usar ID no banco
    //Optional = retorna true ou false sem travar
    //Evitando retorna nulo

    Optional<Cliente> findByemail (String email);
}
