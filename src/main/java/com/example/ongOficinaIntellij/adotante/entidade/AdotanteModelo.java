package com.example.ongOficinaIntellij.adotante.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdotanteModelo {
    @Id
    private Long id;
    private String email;
    private float renda;
    private String cpf;
    private String endereco;
    private String nome;
    private String telefone;
    private String tpMoradia;



}
