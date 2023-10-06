package com.example.ongOficinaIntellij.login.servico;

import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.funcionario.entidade.Funcionario;
import com.example.ongOficinaIntellij.login.entidade.Login;
import org.hibernate.jpa.TypedParameterValue;
import org.hibernate.type.StandardBasicTypes;

import com.example.ongOficinaIntellij.home.visao.home;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;


public class LoginServico {



    public Long login(String login, String senha) {
        String sql = "SELECT * FROM funcionario where login = :login and senha = :senha";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Funcionario.class);

        query.setParameter("login",
                new TypedParameterValue(StandardBasicTypes.STRING, login));
        query.setParameter("senha",
                new TypedParameterValue(StandardBasicTypes.STRING, senha));

        List<Funcionario> resultados = query.getResultList();

        Long loginId = Long.valueOf(0);

        if(resultados != null && !resultados.isEmpty()){
            loginId = resultados.get(0).getId();
        }

    //    UtilitariosBanco.commit();
        return loginId;

    }



}

// WARD ABAIXO.
//        for (Login entidade : resultados) {
//            System.out.println(entidade.getSenha());
//        }

//        resultados.forEach((entidade) -> {
//                    System.out.println(entidade.getSenha());
//                }
//        );
