package Collections.Stagiaire;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Stagiaire> liste = new ArrayList<>();

        liste.add(new Stagiaire("arnauld", "dobe"));
        liste.add(new Stagiaire("jean", "dobe"));
        liste.add(new Stagiaire("paul", "dobe"));
        liste.add(new Stagiaire("come", "dobe"));
        liste.add(new Stagiaire("mylene", "muller"));

        System.out.println(" la liste des stagiaires est : ");

        for (Stagiaire stagiaire : liste) {
            System.out.println( stagiaire.getNom() + " " + stagiaire.getPrenom());
        }
        Collections.sort(liste);

        System.out.println(" la liste des stagiaires triés est :");

        for (Stagiaire stagiaire : liste) {
            System.out.println(" " + stagiaire.getNom() + " " + stagiaire.getPrenom());

        }
    }
}
