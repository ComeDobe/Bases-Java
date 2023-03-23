/**

 Créer une linked list de type Personne.
 Ajouter des objets à l'aide de la méthode addFirst.
 Faire une extraction et suppression des éléments en commençant par le plus ancien, affichez au fur et à mesure.

**/

import Personne.Personne;

import java.time.LocalDate;
import java.util.LinkedList;

public class LinkedListe {
    public static void main(String[] args) {

        LinkedList<Personne> personnes = new LinkedList<>();

        Personne p1 = new Personne("Chris", "Dobe", LocalDate.of(1996, 12, 17));
        Personne p2 = new Personne("Michael", "Dobe", LocalDate.of(2022, 01, 13));
        Personne p3 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        Personne p4 = new Personne("Come", "Dobe", LocalDate.of(2018, 07, 05));
        Personne p5 = new Personne("Chad", "Dobe", LocalDate.of(1999, 11, 15));

        personnes.addFirst(p1);
        personnes.addFirst(p2);
        personnes.addFirst(p3);
        personnes.addFirst(p4);
        personnes.addFirst(p5);

        System.out.println("Linked list avant la suppression : ");
        System.out.println(personnes);

        while (!personnes.isEmpty()) {
            Personne oldestPerson = personnes.getLast();
            System.out.println("Personne la plus ancienne : " + oldestPerson.getPrenom() + " " + oldestPerson.getNom());
            personnes.removeLast();
        }

        System.out.println("Linked list après la suppression : ");
        System.out.println(personnes);

    }
}
