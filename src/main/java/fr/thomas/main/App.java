/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thomas.main;

import fr.thomas.Article;
import fr.thomas.BarCodeScanner;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bulleux
 */
public class App {

    public static void main(String[] args) throws IOException {
        
        BarCodeScanner bc = new BarCodeScanner("toto");
        System.out.println(bc.toString());

        int num = 10;
        Article a1;

                EntityManagerFactory emf
                        = Persistence.createEntityManagerFactory("articlePu");
                EntityManager em = emf.createEntityManager();

                a1 = new Article(bc.getProduit(), num);

                em.getTransaction().begin();
                em.persist(a1);
                em.getTransaction().commit();

                System.out.println("vous avez rentré " + num + " article de " + bc.getProduit());

            


    }

}
