package pres;

import dao.DaoImpl;
import ext.DaoImplv2;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        //Instanciation Statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);//via Constructeur
       // metier.setDao(d); //via Setter
        System.out.println("Resultat ="+metier.calculKelvin());
    }
}
