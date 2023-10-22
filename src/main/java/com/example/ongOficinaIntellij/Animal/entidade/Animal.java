package com.example.ongOficinaIntellij.Animal.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "animal")
    public class Animal {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_animal")
        @Id
        private Long id;

        @Column(name = "idade", nullable = false)
        private Date dt_nascimento;

        @Column(name = "sexo")
        private String sexo;

    @Column(name = "nome")
    private String nome;

        @Column(name = "especie")
        private String especie;

        @Column(name = "castrado")
        private String castrado;

        @Column(name = "porte")
        private String porte;

        @Column(name = "vacina")
        private String vacina;

        @Column(name = "observacao")
        private String observacao;

        @Column(name = "status")
        private String status;

        @Column(name = "id_ong", nullable = true)
        private Long idOng;

    @Column(name = "id_funcionario", nullable = true)
    private Long idFuncionario;

    }

