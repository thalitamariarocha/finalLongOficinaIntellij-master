package com.example.ongOficinaIntellij.adotante.servico;

import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.adotante.entidade.Adotante;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;
import com.example.ongOficinaIntellij.ong.entidade.Ong;
import com.example.ongOficinaIntellij.ong.entidade.OngModelo;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class AdotanteServico {

    public void createOrUpdate(AdotanteModelo adotante) {
        UtilitariosBanco.initConection();
        String sql = "";

        if (adotante.getId() == null) {
            sql = "INSERT INTO cliente (email, renda, cpf, endereco, nome, telefone, tp_moradia) " +
                    "VALUES (:email, :renda, :cpf, :endereco, :nome, :telefone, :tp_moradia)";
        } else {
            sql = "UPDATE cliente SET email = :email, renda = " +
                    " :renda, cpf = :cpf, endereco = :endereco, nome = :nome," +
                    " telefone = :telefone, tp_moradia = :tp_moradia" +
                    " WHERE id_cliente = :id_cliente";
        }

        Query query = UtilitariosBanco.createNativeQuery(sql);

        if (adotante.getId() != null) {
            query.setParameter("id_cliente", adotante.getId());
        }

        query.setParameter("email", adotante.getEmail());
        query.setParameter("cpf", adotante.getCpf());
        query.setParameter("endereco", adotante.getEndereco());
        query.setParameter("nome", adotante.getNome());
        query.setParameter("telefone", adotante.getTelefone());
        query.setParameter("tp_moradia", adotante.getTpMoradia());
        query.setParameter("renda", adotante.getRenda());



        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();

    }

    public List<AdotanteModelo> getList(){

        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM cliente order by nome";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adotante.class);
        List<Adotante> resultList = query.getResultList();

        List<AdotanteModelo> adotanteList = new ArrayList<>();

        resultList.forEach( (adotanteModelo -> {
            AdotanteModelo adotante = new AdotanteModelo();
            adotante.setId(adotanteModelo.getId());
            adotante.setEmail(adotanteModelo.getEmail());
            adotante.setRenda(adotanteModelo.getRenda());
            adotante.setCpf(adotanteModelo.getCpf());
            adotante.setEndereco(adotanteModelo.getEndereco());
            adotante.setNome(adotanteModelo.getNome());
            adotante.setTelefone(adotanteModelo.getTelefone());
            adotante.setTpMoradia(adotanteModelo.getTpMoradia());
            adotanteList.add(adotante);
        }) );

        UtilitariosBanco.close();
        return adotanteList;
    }

    public AdotanteModelo getAdotanteById(Long id){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM cliente WHERE id_cliente = :id_cliente";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adotante.class);
        query.setParameter("id_cliente", id);
        Adotante adotante = (Adotante) query.getSingleResult();
        UtilitariosBanco.close();
        AdotanteModelo adotanteModelo = new AdotanteModelo();
        adotanteModelo.setId(adotante.getId());
        adotanteModelo.setEmail(adotante.getEmail());
        adotanteModelo.setRenda(adotante.getRenda());
        adotanteModelo.setCpf(adotante.getCpf());
        adotanteModelo.setEndereco(adotante.getEndereco());
        adotanteModelo.setNome(adotante.getNome());
        adotanteModelo.setTelefone(adotante.getTelefone());
        adotanteModelo.setTpMoradia(adotante.getTpMoradia());
        return adotanteModelo;
    }

    public void delete(Long id) {
        UtilitariosBanco.initConection();
        String sql = "DELETE FROM cliente WHERE id_cliente = :id_cliente";
        Query query = UtilitariosBanco.createNativeQuery(sql);
        if (id != null) {
            query.setParameter("id_cliente", id);
            query.executeUpdate();
            UtilitariosBanco.commit();
            UtilitariosBanco.close();
        }

    }


    public List<AdotanteModelo> getByCPFOrName(String cpf, String nome ){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM cliente ";

            sql += " WHERE 1=1 ";

        if ( !cpf.isEmpty()){
            sql += " and (cpf like :cpf )";
        }

        if (!nome.isEmpty()){
            sql += "  and upper(nome) like (:nome)";
        }


        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Adotante.class);

        if ( !cpf.isEmpty() ) {
            query.setParameter("cpf", "%" + cpf +"%");
        }

        if (  !nome.isEmpty()) {
            query.setParameter("nome", "%" + nome.toUpperCase()+"%");
        }

        List<Adotante> resultList = query.getResultList();

        List<AdotanteModelo> adotanteList = new ArrayList<>();

        resultList.forEach( (adotanteModelo -> {
            AdotanteModelo adotante = new AdotanteModelo();
            adotante.setId(adotanteModelo.getId());
            adotante.setEmail(adotanteModelo.getEmail());
            adotante.setRenda(adotanteModelo.getRenda());
            adotante.setCpf(adotanteModelo.getCpf());
            adotante.setEndereco(adotanteModelo.getEndereco());
            adotante.setNome(adotanteModelo.getNome());
            adotante.setTelefone(adotanteModelo.getTelefone());
            adotante.setTpMoradia(adotanteModelo.getTpMoradia());

            adotanteList.add(adotante);
        }) );

        UtilitariosBanco.close();
        return adotanteList;
    }

}
