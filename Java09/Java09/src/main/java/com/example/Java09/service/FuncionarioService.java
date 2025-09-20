package com.example.Java09.service;

import ch.qos.logback.core.net.server.Client;
import com.example.Java09.model.Funcionario;
import com.example.Java09.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }
    public Funcionario salvar (Funcionario funcionario){
       return funcionarioRepository.save(funcionario);
    }
    public Funcionario atualizar (Long id, Funcionario funcionario){
        if (funcionarioRepository.existsById(id)) {
            return funcionarioRepository.save(funcionario);
        } else  {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

    public void excluir (Long id){
        funcionarioRepository.deleteAllById(id);
    }
}
