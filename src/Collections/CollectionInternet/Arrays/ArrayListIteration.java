package Collections.CollectionInternet.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println(" On affiche les fruits  avec le foreach :");
        for (String fruit : fruits) {
            System.out.println(" - " + fruit);
        }
        // Suppression d'un elemnt de la liste à l'index 2 :
//       fruits.remove(2);
//            System.out.println(" " +fruits);
    // On parcourt la liste avec le forloop
        System.out.println(" On parcourt la liste avec le forloop :");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(" " + fruits.get(i));
       }
        // On parcour la liste avec l'iterator
        System.out.println(" On parcourt la liste avec l'iterateur :");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(" " + fruit);
        }
        // On parcourt avec l'operateur lambda
        System.out.println(" On parcourt la liste avec l'operateur lambda");
        fruits.forEach( element -> System.out.println(" " + element));

        // Utilisation du for Iterator
        System.out.println(" On parcourt la liste avec le for iterateur :");

        for(Iterator<String> iterator1 = fruits.iterator(); iterator1.hasNext();){
            String fruit = iterator1.next();
            System.out.println( " " + fruit);
        }
        // On utilise la methode removeAll() pour supprimer tous les éléments de la liste
        List<String> subfruitsList = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        fruits.removeAll(subfruitsList);
        System.out.println(" apres suppression des elements de la liste :");

        System.out.println("" +fruits.removeAll(subfruitsList));
    }

}
