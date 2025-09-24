package com.example.Java11.service;

import com.example.Java11.model.Funcionario;
import org.springframework.stereotype.Service;
import com.example.Java11.repository.FuncionarioRepository;

import java.util.List;

@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    //GET
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    //POST
    public Funcionario salvar (Funcionario funcionario){
        //Verificar se funcionario está cadastrado
        if (funcionarioRepository.findBytelefone(funcionario.getTelefone()).isPresent()){
            //Se encontrado o telefone no banco, mostra:
            throw new RuntimeException("Funcionario já cadastrado.");
        }
        //Se não encontrado no banco ele salva
        return funcionarioRepository.save(funcionario);
    }
}
