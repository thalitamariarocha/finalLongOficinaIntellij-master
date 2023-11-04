package com.example.ongOficinaIntellij.adocao.entidade;


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
@Table(name = "adocao")
public class Adocao {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adocao")
    @Id
    private Long id;

    @Column(name = "id_animal", nullable = true)
    private Long id_animal;

    @Column(name = "id_cliente", nullable = true)
    private Long id_adotante;

    @Column(name = "id_funcionario", nullable = true)
    private Long id_funcionario;

    @Column(name = "status")
    private String status;

    @Column(name = "dt_adocao")
    private Date dt_adocao;

    @Column(name = "observacao")
    private String observacao;

}

