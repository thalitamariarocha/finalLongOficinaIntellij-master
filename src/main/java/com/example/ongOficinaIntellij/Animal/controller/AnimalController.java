package com.example.ongOficinaIntellij.Animal.controller;

import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.Animal.servico.AnimalServico;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;
import com.example.ongOficinaIntellij.funcionario.servico.FuncionarioServico;

import java.util.List;

public class AnimalController {

    AnimalServico servico = new AnimalServico();

    public void createOrUpdate(AnimalModelo animalModelo){
        servico.createOrUpdate(animalModelo);
    }

    public void delete(Long id){
        servico.delete(id);
    }

    public List<AnimalModelo> getByEspecieOrName(String especie, String nome){
        return servico.getByEspecieOrName(especie, nome);
    }


    public List<AnimalModelo> getList(){
        return servico.getList();
    }

    public AnimalModelo getAnimalById(Long id){
        return servico.getAnimalById(id);
    }

}
