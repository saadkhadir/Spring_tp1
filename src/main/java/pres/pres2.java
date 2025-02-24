package pres;


import dao.IDao;
import metier.IMetier;

import java.io.File;

import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassname=sc.nextLine();
            Class cDao=Class.forName(daoClassname);
            IDao dao=(IDao)cDao.getConstructor().newInstance();

            String metierClassname=sc.nextLine();
            Class cMetier=Class.forName(metierClassname);
            IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);

            System.out.println("Resultat: "+metier.calculKelvin());
        }
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
