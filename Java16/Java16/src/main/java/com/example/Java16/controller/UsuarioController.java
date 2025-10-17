package com.example.Java16.controller;

import com.example.Java16.dto.UsuarioRequestDTO;
import com.example.Java16.dto.UsuarioResponseDTO;
import com.example.Java16.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(usuarioService.listarTodos());
    }

    //update
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
        @PathVariable Long id, @Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        usuarioService.atualizarUsuario(id, usuarioRequestDTO);

        return ResponseEntity
                .created(null)
                .body(Map.of(
                        "mensagem", "Atualizado com sucesso",
                        "sucesso", true
                ));
    }

    //create
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO){
        usuarioService.salvarUsuario(usuarioRequestDTO);
        return ResponseEntity
                .created(null)
                .body(Map.of(
                        "mensagem", "Cadastrado com sucesso",
                        "sucesso", true
                ));
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable Long id){
        usuarioService.excluirUsuario(id);
        return ResponseEntity
                .ok()
                .body(Map.of(
                        "mensagem", "Excluído com sucesso.",
                        "sucesso", true
                ));
    }
}
