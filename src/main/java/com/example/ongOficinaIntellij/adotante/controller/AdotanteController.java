package com.example.ongOficinaIntellij.adotante.controller;

import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;
import com.example.ongOficinaIntellij.adotante.servico.AdotanteServico;
import com.example.ongOficinaIntellij.ong.entidade.OngModelo;
import com.example.ongOficinaIntellij.ong.servico.OngServico;

import java.util.List;

public class AdotanteController {


    static AdotanteServico servico = new AdotanteServico();

    public static void createOrUpdate(AdotanteModelo adotanteModelo){
        servico.createOrUpdate(adotanteModelo);
    }

    public void delete(Long id){
        servico.delete(id);
    }

    public List<AdotanteModelo> getByCPFOrName(String cpf, String nome){
        return servico.getByCPFOrName(cpf, nome);
    }


    public static List<AdotanteModelo> getList(){
        return servico.getList();
    }

    public AdotanteModelo getAdotanteById(Long id){
        return servico.getAdotanteById(id);
    }


}
