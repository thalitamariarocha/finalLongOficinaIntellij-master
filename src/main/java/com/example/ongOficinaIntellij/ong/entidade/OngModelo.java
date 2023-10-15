package com.example.ongOficinaIntellij.ong.entidade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OngModelo {
    @Id
    private Long id;
    private String email;
    private String cnpj;
    private String endereco;
    private String nome;
    private String telefone;
}
