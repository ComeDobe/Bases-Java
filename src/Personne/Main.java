import Personne.Personne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création des 5 objets Personne
        Personne p1 = new Personne("Dupont", "Jean", LocalDate.of(1990, 1, 1));
        Personne p2 = new Personne("Durand", "Marie", LocalDate.of(1995, 2, 2));
        Personne p3 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        Personne p4 = new Personne("Petit", "Sophie", LocalDate.of(1985, 4, 4));
        Personne p5 = new Personne("Rousseau", "Luc", LocalDate.of(1980, 5, 5));

        // Création de la liste listel et ajout de pl, p3, p4 et p5
        List<Personne> liste1 = new ArrayList<>();
        List<Personne> liste2 = new ArrayList<>();
        liste1.add(p1);
        liste1.add(p3);
        liste1.add(p4);
        liste1.add(p5);

        // Ajout de pz entre pi et p3
        liste1.add(1, p2);
        // Copie de listel dans liste2

        liste2.addAll(liste1);

        // Remplacement d'un élément de listel
        liste1.set(2, new Personne("Dubois", "Marie", LocalDate.of(1990, 6, 6)));

        // Parcours de la liste avec une boucle for each
        for (Personne p : liste1) {
            System.out.println(p.getNom() + " " + p.getPrenom() + " (" + p.getDateNaissance() + ")");
        }

        // Vérification si un objet de type Personne existe dans listel
        if (liste1.indexOf(p3) != -1) {
            System.out.println("p3 est présent dans la liste");
        } else {
            System.out.println("p3 n'est pas présent dans la liste");
        }
        System.out.println(" On parcourt toutte la liste :");

        Iterator<Personne> iterator = liste1.iterator();
        while (iterator.hasNext()) {
            Personne p = iterator.next();
            System.out.println(p.getNom() + " " + p.getPrenom() + " (" + p.getDateNaissance() + ")");
        }
    }
}