package Collections.HashetPersonne;

import Personne.Personne;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet <Personne> liste1 = new HashSet<>();
        HashSet <Personne> liste2 = new HashSet<>();

        // Création des 5 objets Personne
        Personne p1 = new Personne("Dupont", "Jean", LocalDate.of(1990, 1, 1));
        Personne p2 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        //Personne p2 = new Personne("Durand", "Marie", LocalDate.of(1995, 2, 2));
        Personne p3 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        Personne p4 = new Personne("Petit", "Sophie", LocalDate.of(1985, 4, 4));
        Personne p5 = new Personne("Rousseau", "Luc", LocalDate.of(1980, 5, 5));

        liste1.add(p1);
        liste1.add(p2);
        liste1.add(p3);
        liste1.add(p4);
        liste1.add(p5);

        // On copie la liste 1 dans la liste 2 avec la methode addAll()

        liste2.addAll(liste1);

        // On parcourt la liste avec l'ietrateur.

        Iterator<Personne> iterator = liste2.iterator();
        while (iterator.hasNext()) {
            Personne p = iterator.next();
            System.out.println(" " + p.getNom() + " " + p.getPrenom()+ " " + p.getDateNaissance());
        }

    }
}
