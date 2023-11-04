package com.example.ongOficinaIntellij.adocao.controller;

import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.adocao.entidade.AdocaoModelo;
import com.example.ongOficinaIntellij.adocao.entidade.AdocaoViewModel;
import com.example.ongOficinaIntellij.adocao.servico.AdocaoServico;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;

import java.util.List;

public class AdocaoController {
    AdocaoServico servico = new AdocaoServico();

    public void pedidoAdocao(AnimalModelo animal, AdotanteModelo adotante){
        servico.pedidoAdocao(animal, adotante);
    }
    public List<AdocaoModelo> getList(){
        return servico.getList();
    }

    public List<AdocaoViewModel> getList1(){
        return servico.getList1();
    }

    public AdocaoModelo getAdocaoById(Long id){
        return servico.getAdocaoById(id);
    }

    public List<AdocaoModelo> getByStatus(String status){
        return servico.getByStatus(status);
        //return null;
    }

    public List<AdocaoViewModel> getByStatus1(String status){
        return servico.getByStatus1(status);
        //return null;
    }




    public void updateStatus(AdocaoModelo adocao){
        servico.updateStatus(adocao);
    }






}
