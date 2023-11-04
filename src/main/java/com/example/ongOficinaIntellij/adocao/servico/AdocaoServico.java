package com.example.ongOficinaIntellij.adocao.servico;

import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.Utils.UserCache;
import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.adocao.entidade.Adocao;
import com.example.ongOficinaIntellij.adocao.entidade.AdocaoModelo;
import com.example.ongOficinaIntellij.adocao.entidade.AdocaoViewModel;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

//        String sql1 = "";
//
//        sql1 = "UPDATE animal SET status = 'I'" +
//                " WHERE id_animal = :id_animal";
//
//        Query query1 = UtilitariosBanco.createNativeQuery(sql);
//
//        query1.setParameter("id_animal", animal.getId());
//
//        query1.executeUpdate();
//        UtilitariosBanco.commit();

        UtilitariosBanco.close();
    }

    public List<AdocaoViewModel> getList1() {
        UtilitariosBanco.initConection();
        String sql = "SELECT ad.id_adocao, ad.dt_adocao, ad.status, ad.id_animal, ad.id_cliente, ad.id_funcionario, ad.observacao, an.nome as animalNome, cl.nome as clienteNome " +
                "FROM adocao ad " +
                "join animal an on an.id_animal = ad.id_animal " +
                "join cliente cl on cl.id_cliente = ad.id_cliente ";
        Query query = UtilitariosBanco.createNativeQuery(sql);

        query.unwrap(SQLQuery.class)
                .addScalar("id_adocao", LongType.INSTANCE)
                .addScalar("dt_adocao", DateType.INSTANCE)
                .addScalar("status", StringType.INSTANCE)
                .addScalar("id_animal", LongType.INSTANCE)
                .addScalar("id_cliente", LongType.INSTANCE)
                .addScalar("id_funcionario", LongType.INSTANCE)
                .addScalar("observacao", StringType.INSTANCE)
                .addScalar("animalNome", StringType.INSTANCE)
                .addScalar("clienteNome", StringType.INSTANCE);

        List<AdocaoViewModel> adoc = new ArrayList<>();
        List<Object[]> resultList = query.getResultList();

        for (Object[] row : resultList) {
            AdocaoViewModel adocao = new AdocaoViewModel();
            adocao.setId_adocao((Long) row[0]);
            adocao.setDt_adocao((Date) row[1]);
            adocao.setStatus((String) row[2]);
            adocao.setId_animal((Long) row[3]);
            adocao.setId_cliente((Long) row[4]);
            adocao.setId_funcionario((Long) row[5]);
            adocao.setObservacao((String) row[6]);
            adocao.setAnimalNome((String) row[7]);
            adocao.setClienteNome((String) row[8]);
            adoc.add(adocao);
        }

        UtilitariosBanco.close();
        return adoc;
    }

    public List<AdocaoModelo> getList() {

        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM adocao";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adocao.class);
        List<Adocao> resultList = query.getResultList();

        List<AdocaoModelo> adoc = new ArrayList<>();

        resultList.forEach((adocaoModelo -> {
            AdocaoModelo adocao = new AdocaoModelo();
            adocao.setId(adocaoModelo.getId());
            adocao.setDt_adocao(adocaoModelo.getDt_adocao());
            adocao.setStatus(adocaoModelo.getStatus());
            adocao.setId_animal(adocaoModelo.getId_animal());
            adocao.setId_adotante(adocaoModelo.getId_adotante());
            adocao.setId_funcionario(adocaoModelo.getId_funcionario());
            adoc.add(adocao);

        }));

        UtilitariosBanco.close();
        return adoc;
    }

    public List<AdocaoModelo> getListConsulta() {

        UtilitariosBanco.initConection();
        String sql = "SELECT\n" +
                "  adocao.*,\n" +
                "  adotante.nome AS nome_adotante,\n" +
                "  animal.nome AS nome_animal\n" +
                "FROM\n" +
                "  adocao\n" +
                "INNER JOIN\n" +
                "  adotante\n" +
                "  ON adocao.id_adotante = adotante.id\n" +
                "INNER JOIN\n" +
                "  animal\n" +
                "  ON adocao.id_animal = animal.id;";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adocao.class);
        List<Adocao> resultList = query.getResultList();

        List<AdocaoModelo> adoc = new ArrayList<>();

        resultList.forEach((adocaoModelo -> {
            AdocaoModelo adocao = new AdocaoModelo();
            adocao.setId(adocaoModelo.getId());
            adocao.setDt_adocao(adocaoModelo.getDt_adocao());
            adocao.setStatus(adocaoModelo.getStatus());
            adocao.setId_animal(adocaoModelo.getId_animal());
            adocao.setId_adotante(adocaoModelo.getId_adotante());
            adocao.setId_funcionario(adocaoModelo.getId_funcionario());
            adoc.add(adocao);

        }));

        UtilitariosBanco.close();
        return adoc;
    }

    public List<AdocaoViewModel> getByStatus1(String status) {
        UtilitariosBanco.initConection();
        String sql = "SELECT ad.id_adocao, ad.dt_adocao, ad.status, ad.id_animal, ad.id_cliente, ad.id_funcionario, ad.observacao, an.nome as animalNome, cl.nome as clienteNome " +
                "FROM adocao ad " +
                "join animal an on an.id_animal = ad.id_animal " +
                "join cliente cl on cl.id_cliente = ad.id_cliente ";
        if (!status.isEmpty()) {
            sql += " WHERE ad.status = :status";
        }
        Query query = UtilitariosBanco.createNativeQuery(sql);


        if (!status.isEmpty()) {
            query.setParameter("status", status);
        }

        query.unwrap(SQLQuery.class)
                .addScalar("id_adocao", LongType.INSTANCE)
                .addScalar("dt_adocao", DateType.INSTANCE)
                .addScalar("status", StringType.INSTANCE)
                .addScalar("id_animal", LongType.INSTANCE)
                .addScalar("id_cliente", LongType.INSTANCE)
                .addScalar("id_funcionario", LongType.INSTANCE)
                .addScalar("observacao", StringType.INSTANCE)
                .addScalar("animalNome", StringType.INSTANCE)
                .addScalar("clienteNome", StringType.INSTANCE);

        List<AdocaoViewModel> adoc = new ArrayList<>();
        List<Object[]> resultList = query.getResultList();

        for (Object[] row : resultList) {
            AdocaoViewModel adocao = new AdocaoViewModel();
            adocao.setId_adocao((Long) row[0]);
            adocao.setDt_adocao((Date) row[1]);
            adocao.setStatus((String) row[2]);
            adocao.setId_animal((Long) row[3]);
            adocao.setId_cliente((Long) row[4]);
            adocao.setId_funcionario((Long) row[5]);
            adocao.setObservacao((String) row[6]);
            adocao.setAnimalNome((String) row[7]);
            adocao.setClienteNome((String) row[8]);
            adoc.add(adocao);
        }

        UtilitariosBanco.close();
        return adoc;
    }


    public List<AdocaoModelo> getByStatus(String status) {
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM adocao";
        if (!status.isEmpty()) {
            sql += " WHERE status = :status";
        }

        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adocao.class);

        if (!status.isEmpty()) {
            query.setParameter("status", status);
        }

        List<Adocao> resultList = query.getResultList();

        List<AdocaoModelo> adocoes = new ArrayList<>();

        resultList.forEach((adocaoModelo -> {
            AdocaoModelo adocao = new AdocaoModelo();
            adocao.setId(adocaoModelo.getId());
            adocao.setDt_adocao(adocaoModelo.getDt_adocao());
            adocao.setStatus(adocaoModelo.getStatus());
            adocao.setId_animal(adocaoModelo.getId_animal());
            adocao.setId_adotante(adocaoModelo.getId_adotante());
            adocao.setId_funcionario(adocaoModelo.getId_funcionario());
            adocoes.add(adocao);
        }));


        UtilitariosBanco.close();
        return adocoes;
    }

    public AdocaoModelo getAdocaoById(Long id) {
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM adocao WHERE id_adocao = :id_adocao";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adocao.class);
        query.setParameter("id_adocao", id);
        Adocao adocao = (Adocao) query.getSingleResult();
        UtilitariosBanco.close();
        AdocaoModelo adocaoModelo = new AdocaoModelo();
        adocaoModelo.setId(adocao.getId());
        adocaoModelo.setDt_adocao(adocao.getDt_adocao());
        adocaoModelo.setStatus(adocao.getStatus());
        adocaoModelo.setId_animal(adocao.getId_animal());
        adocaoModelo.setId_adotante(adocao.getId_adotante());
        adocaoModelo.setId_funcionario(adocao.getId_funcionario());

        return adocaoModelo;
    }

    public void updateStatus(AdocaoModelo adocao) {
        UtilitariosBanco.initConection();
        String sql = "";

        sql = "UPDATE adocao SET" +
                " status = :status, observacao = :observacao" +
                " WHERE id_adocao = :id_adocao";

        Query query = UtilitariosBanco.createNativeQuery(sql);

        query.setParameter("status", adocao.getStatus());
        query.setParameter("observacao", adocao.getObservacao());
        query.setParameter("id_adocao", adocao.getId());

        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();
    }


}

//    public void aprovaAdocao(AnimalModelo animal, AdotanteModelo adotante) {
//        UtilitariosBanco.initConection();
//        String sql = "";
//
//        sql = "UPDATE adocao SET status" +
//                " status = :status" +
//                " WHERE id_adocao = :id_adocao";
//
//        Query query = UtilitariosBanco.createNativeQuery(sql);
//
//        query.setParameter("status", "A");
//        query.setParameter("id_adocao", adotante.getId());
//
//        query.executeUpdate();
//
//        UtilitariosBanco.commit();
//        UtilitariosBanco.close();
//    }
//
//    public void reprovaAdocao(AnimalModelo animal, AdotanteModelo adotante) {
//        UtilitariosBanco.initConection();
//        String sql = "";
//
//        sql = "UPDATE adocao SET status" +
//                " status = :status" +
//                " WHERE id_adocao = :id_adocao";
//
//        Query query = UtilitariosBanco.createNativeQuery(sql);
//
//        query.setParameter("status", "R");
//        query.setParameter("id_adocao", adotante.getId());
//
//        query.executeUpdate();
//
//        UtilitariosBanco.commit();
//        UtilitariosBanco.close();
//    }
