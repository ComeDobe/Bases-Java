package Collections.TriListe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriListe {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        ArrayList<String> liste = new ArrayList<>();
//
//       System.out.println(" saisir l'element n°: "+(i+1));

       System.out.println("Veuillez saisir les éléments de la liste (saisir 'fin' pour terminer) :");
       String element = "";

        while (!element.equals("fin")) {
            element = clavier.nextLine();
            if (!element.equals("fin")) {
                liste.add(element);
            }
        }
        Collections.sort(liste);
        // Affiche les éléments de la liste triée

        System.out.println("Les éléments de la liste triée sont :");
        for (String str : liste) {
            System.out.println(str);

    }
}
}
