/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thomas.jpa2020;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author bulleux
 */
public class App {

    public static void main(String[] args) {
        Article a1, a2, a3;

        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("articlePu");
        EntityManager em = emf.createEntityManager();

        a1 = new Article("brosse", 10);

        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();

        System.out.println("entité 1 créée : " + a1);
        
        a2 = new Article("balai", 25);
        em.getTransaction().begin();
        em.persist(a2);
        em.getTransaction().commit();

        System.out.println("entité 1 créée : " + a2);
    }

}
