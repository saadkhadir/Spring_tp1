package pres;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presAvecSpringAnnotations {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = (IMetier) context.getBean("metier");
    System.out.println("Resultat = "+metier.calculKelvin());
    }
}
