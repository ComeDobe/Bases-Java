package Collections.ArrayListHasmhap;

import java.util.ArrayList;

public class UtilisationArraysList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Ajout d'éléments à la liste
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Affichage de la liste
        System.out.println("Liste originale : " + list);
        System.out.println("---------------------------------------------------");
        // Ajout d'un élément à la position 2
        list.add(2, "Elderberry");

        // Affichage de la liste
        System.out.println("Liste après l'ajout d'un élément : " + list);
        System.out.println("---------------------------------------------------");
        // Suppression d'un élément
        list.remove("Date");

        // Affichage de la liste
        System.out.println("Liste après la suppression d'un élément : " + list);
        System.out.println("---------------------------------------------------");
        // Récupération d'un élément à partir de sa position
        String fruit = list.get(2);
        System.out.println("Fruit récupéré à partir de sa position : " + fruit);
        System.out.println("---------------------------------------------------");
        // Récupération de la taille de la liste
        int size = list.size();
        System.out.println("Taille de la liste : " + size);
        System.out.println("---------------------------------------------------");
    }
}
