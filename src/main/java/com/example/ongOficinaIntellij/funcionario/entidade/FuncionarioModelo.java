package com.example.ongOficinaIntellij.funcionario.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioModelo {
    @Id
    private Long id;
    private String login;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;
    private String nome;
    private String telefone;
    private String tpUsuario;
    private int idOng;
}
