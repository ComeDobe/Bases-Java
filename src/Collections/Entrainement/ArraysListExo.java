package Collections.Entrainement;

import java.util.ArrayList;

public class ArraysListExo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("pomme");
        list.add("Banane");
        list.add("Mangue");
        list.add("Mandarine");

        System.out.println(" ma premiere liste de fruit est :" + list);

        System.out.println("l'index de mon element banane se trouve à : " + list.indexOf("Banane"));

        System.out.println(" ma liste triée est : " + list.stream().sorted());

        // j'ajoute un fruit à la position 3
        list.add(3, "orange");
        System.out.println(" ma nouvelle liste de fruit est :" + list);
        // suppression d'un fruit à la postion 0;
        list.remove(0);
        System.out.println(" ma nouvelle liste de fruit est :" + list);
        // je modifie un fruit à la position 2
        list.set(2, "Carotte");
        System.out.println(" ma nouvelle liste de fruit est :" + list);

        // je recupere un fuit à la postion 2
        String fruit = list.get(2);
        System.out.println(" ma nouvelle liste de fruit est :" + fruit);


        // je determine la taille de mon tableau
        int taille = list.size();
        System.out.println(" la taille de mon tableau est :" + taille);

    }
}
