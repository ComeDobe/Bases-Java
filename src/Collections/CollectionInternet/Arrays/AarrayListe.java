package Collections.CollectionInternet.Arrays;

import java.util.ArrayList;

public class AarrayListe {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Java");
        liste.add("Python");
        liste.add("PHP");
        liste.add("C#");
        liste.add("C++");
        liste.add("Asp.Net");

        // On determine la taille de la liste
        liste.size();
        System.out.println(" la taille de la liste est :" + liste.size());
        // recuperer un element à l'indice 2
        liste.get(2);
        System.out.println(" l'element " +liste.get(2) + " est trouvé à l'index : " + liste.indexOf(liste.get(2)));

        // On midifie l'element à l'indice 2
        liste.set(2, "PHP");

        System.out.println(" manouvelle liste est : " + liste);
    }
}
