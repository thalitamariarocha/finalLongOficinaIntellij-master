package com.example.ongOficinaIntellij.funcionario.servico;

import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.funcionario.entidade.Funcionario;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;


import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioServico {

    public void createOrUpdate(FuncionarioModelo funcionario) {
        UtilitariosBanco.initConection();
        String sql = "";

        if (funcionario.getId() == null) {
            sql = "INSERT INTO Funcionario (login, email, senha, cpf, endereco, nome, telefone, tp_usuario, id_ong) " +
                    "VALUES (:login, :email, :senha, :cpf, :endereco, :nome, :telefone, :tp_usuario, :id_ong)";
        } else {
            sql = "UPDATE Funcionario SET login = :login, email = :email, senha = " +
                    " :senha, cpf = :cpf, endereco = :endereco, nome = :nome," +
                    " telefone = :telefone, tp_usuario = :tp_usuario, id_ong = :id_ong " +
                    " WHERE id_funcionario = :id_funcionario";
        }

        Query query = UtilitariosBanco.createNativeQuery(sql);

        if (funcionario.getId() != null) {
            query.setParameter("id_funcionario", funcionario.getId());
        }

        query.setParameter("login", funcionario.getLogin());
        query.setParameter("email", funcionario.getEmail());
        query.setParameter("senha", funcionario.getSenha());
        query.setParameter("cpf", funcionario.getCpf());
        query.setParameter("endereco", funcionario.getEndereco());
        query.setParameter("nome", funcionario.getNome());
        query.setParameter("telefone", funcionario.getTelefone());
        query.setParameter("tp_usuario", funcionario.getTpUsuario());
        query.setParameter("id_ong", funcionario.getIdOng());

        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();

    }

    public List<FuncionarioModelo> getList(){

        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM Funcionario order by nome";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Funcionario.class);
        List<Funcionario> resultList = query.getResultList();

        List<FuncionarioModelo> func = new ArrayList<>();

        resultList.forEach( (funcionarioModelo -> {
            FuncionarioModelo funcionario = new FuncionarioModelo();
            funcionario.setId(funcionarioModelo.getId());
            funcionario.setLogin(funcionarioModelo.getLogin());
            funcionario.setEmail(funcionarioModelo.getEmail());
            funcionario.setSenha(funcionarioModelo.getSenha());
            funcionario.setCpf(funcionarioModelo.getCpf());
            funcionario.setEndereco(funcionarioModelo.getEndereco());
            funcionario.setNome(funcionarioModelo.getNome());
            funcionario.setTelefone(funcionarioModelo.getTelefone());
            funcionario.setTpUsuario(funcionarioModelo.getTpUsuario());
            funcionario.setIdOng(funcionarioModelo.getIdOng());
            func.add(funcionario);
        }) );

        UtilitariosBanco.close();
        return func;
    }

    public FuncionarioModelo getFuncionarioById(Long id){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM Funcionario WHERE id_funcionario = :id_funcionario";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Funcionario.class);
        query.setParameter("id_funcionario", id);
        Funcionario funcionario = (Funcionario) query.getSingleResult();
        UtilitariosBanco.close();
        FuncionarioModelo funcionarioModelo = new FuncionarioModelo();
        funcionarioModelo.setId(funcionario.getId());
        funcionarioModelo.setLogin(funcionario.getLogin());
        funcionarioModelo.setEmail(funcionario.getEmail());
        funcionarioModelo.setSenha(funcionario.getSenha());
        funcionarioModelo.setCpf(funcionario.getCpf());
        funcionarioModelo.setEndereco(funcionario.getEndereco());
        funcionarioModelo.setNome(funcionario.getNome());
        funcionarioModelo.setTelefone(funcionario.getTelefone());
        funcionarioModelo.setTpUsuario(funcionario.getTpUsuario());
        funcionarioModelo.setIdOng(funcionario.getIdOng());
        return funcionarioModelo;
    }

    public void delete(Long id) {
        UtilitariosBanco.initConection();
        String sql = "DELETE FROM Funcionario WHERE id_funcionario = :id_funcionario";
        Query query = UtilitariosBanco.createNativeQuery(sql);
        if (id != null) {
            query.setParameter("id_funcionario", id);
            query.executeUpdate();
            UtilitariosBanco.commit();
            UtilitariosBanco.close();
        }

    }


    public List<FuncionarioModelo> getByCPFOrName(String cpf, String nome ){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM Funcionario ";
        if ( !cpf.isEmpty() || !nome.isEmpty()){
            sql += " WHERE cpf = :cpf OR nome = :nome";
        }

        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Funcionario.class);

        if ( !cpf.isEmpty() || !nome.isEmpty()) {
            query.setParameter("cpf", cpf);
            query.setParameter("nome", nome);
        }

        List<Funcionario> resultList = query.getResultList();

        List<FuncionarioModelo> func = new ArrayList<>();

        resultList.forEach( (funcionarioModelo -> {
            FuncionarioModelo funcionario = new FuncionarioModelo();
            funcionario.setId(funcionarioModelo.getId());
            funcionario.setLogin(funcionarioModelo.getLogin());
            funcionario.setEmail(funcionarioModelo.getEmail());
            funcionario.setSenha(funcionarioModelo.getSenha());
            funcionario.setCpf(funcionarioModelo.getCpf());
            funcionario.setEndereco(funcionarioModelo.getEndereco());
            funcionario.setNome(funcionarioModelo.getNome());
            funcionario.setTelefone(funcionarioModelo.getTelefone());
            funcionario.setTpUsuario(funcionarioModelo.getTpUsuario());
            funcionario.setIdOng(funcionarioModelo.getIdOng());
            func.add(funcionario);
        }) );

        UtilitariosBanco.close();
        return func;
    }

}
