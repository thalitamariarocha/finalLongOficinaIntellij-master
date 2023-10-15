package com.example.ongOficinaIntellij.ong.controller;


import com.example.ongOficinaIntellij.ong.entidade.OngModelo;
import com.example.ongOficinaIntellij.ong.servico.OngServico;

import java.util.List;

public class OngController {

    OngServico servico = new OngServico();

    public void createOrUpdate(OngModelo ongModelo){
        servico.createOrUpdate(ongModelo);
    }

    public void delete(Long id){
        servico.delete(id);
    }

    public List<OngModelo> getByCNPJOrName(String cnpj, String nome){
        return servico.getByCNPJOrName(cnpj, nome);
    }


    public List<OngModelo> getList(){
        return servico.getList();
    }

    public OngModelo getOngById(Long id){
        return servico.getOngById(id);
    }
}
