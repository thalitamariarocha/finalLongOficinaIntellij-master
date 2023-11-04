package com.example.ongOficinaIntellij.adocao.entidade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Date;


@Getter
@Setter
public class AdocaoViewModel {
    @Id
    private Long id_adocao;
    private Long id_animal;
    private Long id_adotante;
    private Long id_funcionario;
    private Long id_cliente;

    private String animalNome;
    private String clienteNome;

    private String status;
    private String observacao;
    private Date dt_adocao;


}
