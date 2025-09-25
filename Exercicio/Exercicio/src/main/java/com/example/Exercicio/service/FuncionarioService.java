package com.example.Exercicio.service;

import com.example.Exercicio.model.Funcionario;
import com.example.Exercicio.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService (FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    //GET
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    //POST
    public Funcionario salvar (Funcionario funcionario){
        if (funcionarioRepository.findBycpf(funcionario.getCpf()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado.");
        }
        return funcionarioRepository.save(funcionario);
    }
}
