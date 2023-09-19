package com.example.ongOficinaIntellij.funcionario.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionario")
public class Funcionario {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    @Id
    private Long id;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "cpf",unique = true)
    private String cpf;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;
    
    @Column(name = "tp_usuario")
    private String tpUsuario;
        
    @Column(name = "id_ong", nullable = true)
    private int idOng;

}
