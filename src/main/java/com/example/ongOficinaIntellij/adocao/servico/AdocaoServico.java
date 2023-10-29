package com.example.ongOficinaIntellij.adocao.servico;

import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.Utils.UserCache;
import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;

import javax.persistence.Query;
import java.util.Date;

public class AdocaoServico {
    Date today = new Date();
    UserCache userCache = new UserCache();
    public void pedidoAdocao(AnimalModelo animal, AdotanteModelo adotante) {
        UtilitariosBanco.initConection();
        String sql = "";


        sql = "INSERT INTO adocao (dt_adocao, status, id_cliente, id_animal, id_funcionario) " +
                    "VALUES (:dt_adocao, :status, :id_cliente, :id_animal, :id_funcionario)";


        Query query = UtilitariosBanco.createNativeQuery(sql);

        query.setParameter("dt_adocao", today);
        query.setParameter("status", "P");
        query.setParameter("id_cliente", adotante.getId());
        query.setParameter("id_animal", animal.getId());
        query.setParameter("id_funcionario", userCache.getLoggedInUserId());


        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();

    }
}
