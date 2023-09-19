package com.example.ongOficinaIntellij.funcionario.controller;

import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;
import com.example.ongOficinaIntellij.funcionario.servico.FuncionarioServico;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FuncionarioController {

    FuncionarioServico servico = new FuncionarioServico();

    public void createOrUpdate(FuncionarioModelo funcionarioModelo){
        servico.createOrUpdate(funcionarioModelo);
    }


    public List<FuncionarioModelo> getList(){
        return servico.getList();
    }

    public FuncionarioModelo getFuncionarioById(Long id){
        return servico.getFuncionarioById(id);
    }
}
