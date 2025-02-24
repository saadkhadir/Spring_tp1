package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        //Instanciation Statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("Resultat ="+metier.calculKelvin());
    }
}
