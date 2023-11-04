package com.example.ongOficinaIntellij.ong.servico;
import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.ong.entidade.Ong;
import com.example.ongOficinaIntellij.ong.entidade.OngModelo;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class OngServico {

    public void createOrUpdate(OngModelo ong) {
        UtilitariosBanco.initConection();
        String sql = "";

        if (ong.getId() == null) {
            sql = "INSERT INTO ong (email, cnpj, endereco, nome, telefone) " +
                    "VALUES (:email, :cnpj, :endereco, :nome, :telefone)";
        } else {
            sql = "UPDATE ong SET email = :email," +
                    " cnpj = :cnpj, endereco = :endereco, nome = :nome," +
                    " telefone = :telefone" +
                    " WHERE id_ong = :id_ong";
        }

        Query query = UtilitariosBanco.createNativeQuery(sql);

        if (ong.getId() != null) {
            query.setParameter("id_ong", ong.getId());
        }

        query.setParameter("email", ong.getEmail());
        query.setParameter("cnpj", ong.getCnpj());
        query.setParameter("endereco", ong.getEndereco());
        query.setParameter("nome", ong.getNome());
        query.setParameter("telefone", ong.getTelefone());


        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();

    }

    public List<OngModelo> getList(){

        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM ong order by nome";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Ong.class);
        List<Ong> resultList = query.getResultList();

        List<OngModelo> ongList = new ArrayList<>();

        resultList.forEach( (ongModelo -> {
            OngModelo ong = new OngModelo();
            ong.setId(ongModelo.getId());
            ong.setEmail(ongModelo.getEmail());
            ong.setCnpj(ongModelo.getCnpj());
            ong.setEndereco(ongModelo.getEndereco());
            ong.setNome(ongModelo.getNome());
            ong.setTelefone(ongModelo.getTelefone());
            ongList.add(ong);
        }) );

        UtilitariosBanco.close();
        return ongList;
    }

    public OngModelo getOngById(Long id){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM ong WHERE id_ong = :id_ong";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Ong.class);
        query.setParameter("id_ong", id);
        Ong ong = (Ong) query.getSingleResult();
        UtilitariosBanco.close();
        OngModelo ongModelo = new OngModelo();
        ongModelo.setId(ong.getId());
        ongModelo.setEmail(ong.getEmail());
        ongModelo.setCnpj(ong.getCnpj());
        ongModelo.setEndereco(ong.getEndereco());
        ongModelo.setNome(ong.getNome());
        ongModelo.setTelefone(ong.getTelefone());
        return ongModelo;
    }

    public void delete(Long id) {
        UtilitariosBanco.initConection();
        String sql = "DELETE FROM ong WHERE id_ong = :id_ong";
        Query query = UtilitariosBanco.createNativeQuery(sql);
        if (id != null) {
            query.setParameter("id_ong", id);
            query.executeUpdate();
            UtilitariosBanco.commit();
            UtilitariosBanco.close();
        }

    }


    public List<OngModelo> getByCNPJOrName(String cnpj, String nome ){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM ong ";

        sql += " WHERE 1=1 ";

        if ( !cnpj.isEmpty()){
            sql += " and (cnpj like :cnpj)";
        }

        if (!nome.isEmpty()){
            sql += "  and upper(nome) like (:nome)";
        }


        if ( !cnpj.isEmpty() || !nome.isEmpty()){
            sql += " WHERE cpf like :cnpj OR upper(nome) like (:nome)";
        }

        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Ong.class);

        if ( !cnpj.isEmpty() ) {
            query.setParameter("cnpj", "%" + cnpj +"%");
        }

        if (  !nome.isEmpty()) {
            query.setParameter("nome", "%" + nome.toUpperCase()+"%");
        }

        List<Ong> resultList = query.getResultList();

        List<OngModelo> ongList = new ArrayList<>();

        resultList.forEach( (ongModelo -> {
            OngModelo ong = new OngModelo();
            ong.setId(ongModelo.getId());
            ong.setEmail(ongModelo.getEmail());
            ong.setCnpj(ongModelo.getCnpj());
            ong.setEndereco(ongModelo.getEndereco());
            ong.setNome(ongModelo.getNome());
            ong.setTelefone(ongModelo.getTelefone());

            ongList.add(ong);
        }) );

        UtilitariosBanco.close();
        return ongList;
    }

}
