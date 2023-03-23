package Collections.Treeset;

import Personne.Personne;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class ObjetTreeset {

    public static void main(String[] args) {

        Set<Personne> client= new TreeSet<Personne>();

        Personne p1 = new Personne("Chris", "Dobe", LocalDate.of(1996, 12, 17));
        Personne p2 = new Personne("Michael", "Dobe", LocalDate.of(2022, 01, 13));
        Personne p3 = new Personne("Martin", "Pierre", LocalDate.of(2000, 3, 3));
        Personne p4 = new Personne("Come", "Dobe", LocalDate.of(2018, 07, 05));
        Personne p5 = new Personne("Chad", "Dobe", LocalDate.of(1999, 11, 15));

        client.add(p1);
        client.add(p2);
        client.add(p3);
        client.add(p4);
        client.add(p5);

        System.out.println( " les infos des clients sont : ");
    for (Personne p : client) {
        System.out.println(p.getNom() + " " + p.getPrenom() + " " + p.getDateNaissance());
    }
    Set<Personne> client2= new TreeSet<Personne>();
    client2.addAll(client);

    for (Personne p : client2) {
        System.out.println(p.getDateNaissance());
    }
    Set<Personne> client3= new TreeSet<Personne>();

    client3.addAll(client);

    for (Personne p : client3) {
        System.out.println(p.getNom());
    }
Set<Personne> client4= new TreeSet<Personne>();
    client4.addAll(client);
    for (Personne p : client4) {

        System.out.println(p.getNom());
    }
    }
}
