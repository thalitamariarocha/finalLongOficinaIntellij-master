package com.example.ongOficinaIntellij.ong.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ong")
public class Ong {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ong")
    @Id
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "cnpj",unique = true)
    private String cnpj;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

}