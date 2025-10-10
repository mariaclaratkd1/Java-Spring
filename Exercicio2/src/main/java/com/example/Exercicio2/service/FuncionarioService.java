package com.example.Exercicio2.service;
import com.example.Exercicio2.model.Funcionario;
import com.example.Exercicio2.repository.FucnionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private FucnionarioRepository fucnionarioRepository;

    public List<Funcionario> listarTodos(){
        return FucnionarioRepository.findAll();
    }

    public Funcionario salvar (Funcionario funcionario){
        if (fucnionarioRepository.findByEmail(funcionario.getEmail().isPresent){
            throw new RuntimeException("Email já cadastrado!");
        }
        return fucnionarioRepository.save(funcionario);
    }

    public Funcionario atualizar (Long id, Funcionario funcionario) {
        if (!funcionario.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        funcionario.setId(id);
        return funcionario.save(funcionario);
    }

    public void deletar (Long id) {
        if (!fucnionarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        fucnionarioRepository.deleteById(id);
    }
}
