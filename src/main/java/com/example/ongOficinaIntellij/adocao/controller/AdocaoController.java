package com.example.ongOficinaIntellij.adocao.controller;

import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.adocao.servico.AdocaoServico;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;

public class AdocaoController {
    AdocaoServico servico = new AdocaoServico();

    public void pedidoAdocao(AnimalModelo animal, AdotanteModelo adotante){
        servico.pedidoAdocao(animal, adotante);
    }
}
