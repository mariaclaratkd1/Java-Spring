package com.example.demo.model;

public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saude"),
    JURIDICO ("Juridico");

    public String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
