package com.example.Exercicio2.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String cidade;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
