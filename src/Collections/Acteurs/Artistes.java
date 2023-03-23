package Collections.Acteurs;

import Personne.Personne;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Artistes {
    public static void main(String[] args) {

        // On cree deux ensembles , chanteurs et acteurs

        Set<Personne> chanteurs = new HashSet<>();
        Set<Personne> acteurs= new HashSet<>();

        Personne p1 = new Personne("Chris", " Dobe", LocalDate.of(1996,12,17));
        Personne p2 = new Personne("Michael", " Dobe", LocalDate.of(2022,01,13));
        Personne p3 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        Personne p4 = new Personne("Come", " Dobe", LocalDate.of(2018,07,05));
        Personne p5 = new Personne("Chad", " Dobe", LocalDate.of(199,11,15));

        chanteurs.add(p1);
        chanteurs.add(p3);

        acteurs.add(p1);
        acteurs.add(p2);
        acteurs.add(p4);
        acteurs.add(p5);

        // On teste si les ensembles sont identiques avec la methode containsAll()

        boolean chanteuretActeurs = chanteurs.containsAll(acteurs);
        System.out.println("Chanteur et acteurs : " + chanteuretActeurs);

        // On cree un ensemble artistes contenant les chanteurs et les acteurs

        Set<Personne> artistes = new HashSet<>(chanteurs);

        artistes.addAll(acteurs);

        System.out.println(" la liste des artistes :");

        for (Personne p : artistes) {
            System.out.println( "- " +p.getNom()+ " " + p.getPrenom()+ " - " + p.getDateNaissance());
        }
        // On cree un ensemble act-chant  qui sont chanteurs et acteurs avec la methode retainAll()

        Set<Personne> actchant = new HashSet<>(chanteurs);
        actchant.retainAll(acteurs);

        System.out.println(" les acteurs qui sont aussi des chanteurs :");


        for (Personne p : actchant) {
            System.out.println(p.getNom()+ " " + p.getPrenom()+ " - " + p.getDateNaissance());
        }
        // On cree un ensemble chanteur uniquement avec la methode removeAll()
        Set<Personne> uniquementChanteur = new HashSet<>(chanteurs);
        uniquementChanteur.removeAll(acteurs);

        System.out.println(" les chanteurs uniquement :");
        for (Personne p : uniquementChanteur) {
            System.out.println(p.getNom()+ " " + p.getPrenom()+ " - " + p.getDateNaissance());
        }

        // On cree un ensemble chanteur uniquement avec la methode removeAll()

        Set<Personne> uniquementActeur = new HashSet<>(acteurs);
        uniquementActeur.removeAll(chanteurs);

        System.out.println(" les acteurs uniquement :");
        for (Personne p : uniquementActeur) {

            System.out.println(p.getNom()+ " " + p.getPrenom()+ " - " + p.getDateNaissance());
        }
    }
}
