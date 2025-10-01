package com.example.Java13.repository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Java13.model.Usuariomodel;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuariomodel, UUID> {
    //Método para buscar usuário por email no baco de dados
    //SELECT * FROM tab_usuario WHERE email = ?
    //O Optional é usado para evitar o retorno nulo
    //Se o usuário existir, ele retorna o usuário, se não, retorna vazio
    //O Optional é uma classe que envolve um valor que pode estar presente ou ausente
    //É uma forma de evitar o NullPointerException
    //O Optional é uma classe genérica, ou seja, pode ser usado com qualquer tipo de dado
    Optional <Usuariomodel> findByEmail(String email);
}
