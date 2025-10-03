package com.example.Java14.exception;

public class EmailCadastradoException extends IllegalArgumentException {
    public EmailCadastradoException(String messagem) {
        super("Email já cadastrado");
    }
}
