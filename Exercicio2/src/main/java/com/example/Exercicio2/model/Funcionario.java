package com.example.Exercicio2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private double salario;

    @Column(nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
