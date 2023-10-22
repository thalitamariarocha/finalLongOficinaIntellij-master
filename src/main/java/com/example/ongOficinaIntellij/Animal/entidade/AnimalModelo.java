package com.example.ongOficinaIntellij.Animal.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimalModelo {

    @Id
    private Long id;
    private Date dt_nascimento;
    private String sexo;
    private String nome;
    private String especie;
    private String castrado;
    private String porte;
    private String vacina;
    private String observacao;
    private String status;
    private Long idOng;
    private Long idFuncionario;

}
