package com.example.ongOficinaIntellij.Animal.servico;

import com.example.ongOficinaIntellij.Animal.entidade.Animal;
import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.Utils.UtilitariosBanco;
import com.example.ongOficinaIntellij.funcionario.entidade.Funcionario;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class AnimalServico {


    public void createOrUpdate(AnimalModelo animal) {
        UtilitariosBanco.initConection();
        String sql = "";

        if (animal.getId() == null) {
            sql = "INSERT INTO animal (nome, idade, sexo, especie, castrado, porte, vacina, observacao, status, id_ong, id_funcionario) " +
                    "VALUES (:nome, :dt_nascimento, :sexo, :especie, :castrado, :porte, :vacina, :observacao, :status, :id_ong, :id_funcionario)";
        } else {
            sql = "UPDATE animal SET nome = :nome, idade = :dt_nascimento, sexo = :sexo, especie = " +
                    " :especie, castrado = :castrado, porte = :porte, vacina = :vacina," +
                    " observacao = :observacao, status = :status, id_ong = :id_ong, id_funcionario = :id_funcionario" +
                    " WHERE id_animal = :id_animal";
        }

        Query query = UtilitariosBanco.createNativeQuery(sql);

        if (animal.getId() != null) {
            query.setParameter("id_animal", animal.getId());
        }

        query.setParameter("dt_nascimento", animal.getDt_nascimento());
        query.setParameter("sexo", animal.getSexo());
        query.setParameter("nome", animal.getNome());
        query.setParameter("especie", animal.getEspecie());
        query.setParameter("castrado", animal.getCastrado());
        query.setParameter("porte", animal.getPorte());
        query.setParameter("vacina", animal.getVacina());
        query.setParameter("observacao", animal.getObservacao());
        query.setParameter("status", animal.getStatus());
        query.setParameter("id_ong", animal.getIdOng());
        query.setParameter("id_funcionario", animal.getIdFuncionario());


        query.executeUpdate();

        UtilitariosBanco.commit();
        UtilitariosBanco.close();

    }

    public List<AnimalModelo> getList(){

        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM animal order by nome";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Animal.class);
        List<Animal> resultList = query.getResultList();

        List<AnimalModelo> animal1 = new ArrayList<>();

        resultList.forEach( (animalmodelo -> {
            AnimalModelo animal = new AnimalModelo();
            animal.setId(animalmodelo.getId());
            animal.setDt_nascimento(animalmodelo.getDt_nascimento());
            animal.setNome(animalmodelo.getNome());
            animal.setSexo(animalmodelo.getSexo());
            animal.setEspecie(animalmodelo.getEspecie());
            animal.setCastrado(animalmodelo.getCastrado());
            animal.setPorte(animalmodelo.getPorte());
            animal.setVacina(animalmodelo.getVacina());
            animal.setObservacao(animalmodelo.getObservacao());
            animal.setStatus(animalmodelo.getStatus());
            animal.setIdOng(animalmodelo.getIdOng());
            animal.setIdFuncionario(animalmodelo.getIdFuncionario());
            animal1.add(animal);

        }) );

        UtilitariosBanco.close();
        return animal1;
    }

    public AnimalModelo getAnimalById(Long id){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM animal WHERE id_animal = :id_animal";
        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Animal.class);
        query.setParameter("id_animal", id);
        Animal animal = (Animal) query.getSingleResult();
        UtilitariosBanco.close();
        AnimalModelo animalModelo = new AnimalModelo();
        animalModelo.setId(animal.getId());
        animalModelo.setDt_nascimento(animal.getDt_nascimento());
        animalModelo.setNome(animal.getNome());
        animalModelo.setSexo(animal.getSexo());
        animalModelo.setEspecie(animal.getEspecie());
        animalModelo.setCastrado(animal.getCastrado());
        animalModelo.setPorte(animal.getPorte());
        animalModelo.setVacina(animal.getVacina());
        animalModelo.setObservacao(animal.getObservacao());
        animalModelo.setStatus(animal.getStatus());
        animalModelo.setIdOng(animal.getIdOng());
        animalModelo.setIdFuncionario(animal.getIdFuncionario());

        return animalModelo;
    }

    public void delete(Long id) {
        UtilitariosBanco.initConection();
        String sql = "DELETE FROM animal WHERE id_animal = :id_animal";
        Query query = UtilitariosBanco.createNativeQuery(sql);
        if (id != null) {
            query.setParameter("id_animal", id);
            query.executeUpdate();
            UtilitariosBanco.commit();
            UtilitariosBanco.close();
        }

    }


    public List<AnimalModelo> getByStatusOrName(String status, String nome ){
        UtilitariosBanco.initConection();
        String sql = "SELECT * FROM animal";
        if ( !status.isEmpty() || !nome.isEmpty()){
            sql += " WHERE status = :status OR nome = :nome";
        }

        Query query = UtilitariosBanco.createNativeQueryWithClas(sql, Animal.class);

        if ( !status.isEmpty() || !nome.isEmpty()) {
            query.setParameter("status", "D");
            query.setParameter("nome", nome);
        }

        List<Animal> resultList = query.getResultList();

        List<AnimalModelo> animal1 = new ArrayList<>();

        resultList.forEach( (animalModelo -> {
            AnimalModelo animal = new AnimalModelo();
            animal.setId(animalModelo.getId());
            animal.setDt_nascimento(animalModelo.getDt_nascimento());
            animal.setNome(animalModelo.getNome());
            animal.setSexo(animalModelo.getSexo());
            animal.setEspecie(animalModelo.getEspecie());
            animal.setCastrado(animalModelo.getCastrado());
            animal.setPorte(animalModelo.getPorte());
            animal.setVacina(animalModelo.getVacina());
            animal.setObservacao(animalModelo.getObservacao());
            animal.setStatus(animalModelo.getStatus());
            animal.setIdOng(animalModelo.getIdOng());
            animal.setIdFuncionario(animalModelo.getIdFuncionario());

            animal1.add(animal);

        }) );

        UtilitariosBanco.close();
        return animal1;
    }



}
