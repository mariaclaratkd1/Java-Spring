package com.example.Java14.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(EmailCadastradoException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(EmailCadastradoException erro) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("mensagem", erro.getMessage(), "status", "erro"));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(RuntimeException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getMessage(), "status", "erro"));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handlerRuntimeException(RuntimeException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getMessage(), "status", "erro"));
    }
}
