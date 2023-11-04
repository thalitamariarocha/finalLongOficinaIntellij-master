package com.example.ongOficinaIntellij.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UtilitariosBanco {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void initConection(){
        emf = Persistence.createEntityManagerFactory("exemploPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public static Query createQuery(String sql){
        return em.createQuery(sql);
    }

    public static Query createNativeQuery(String sql){
        return em.createNativeQuery(sql);
    }

    public static Query createNativeQueryWithClas(String sql, Class classe){
        return em.createNativeQuery(sql, classe);
    }

    public static Query createNativeQueryWithClas2(String sql){
        // criar uma quary que devolve um objeto sem precisar de uma classe

        return em.createNativeQuery(sql);
    }

    public static void commit(){
        em.getTransaction().commit();
    }

    public static void close() {
        em.close();
        emf.close();
    }
}
