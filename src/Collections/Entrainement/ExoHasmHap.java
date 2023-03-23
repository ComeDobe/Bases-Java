package Collections.Entrainement;

import java.util.HashMap;

public class ExoHasmHap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("chris", 35);
        map.put("john", 20);
        map.put("jane", 15);
        map.put("paul", 10);
        map.put("george", 5);
        map.put("david", 2);


        System.out.println("afficher les elemnts de ma liste : " + map);
        // ajouter un nom de l'utilisateur à la liste à l'index 2'

      map.put("george", 40);
        System.out.println(" ma nouvelle liste : " + map);
        // supprimer un nom de l'utilisateur de la liste à l'index 2'
        map.remove("george");

        System.out.println(" ma nouvelle liste reactulisée est : " + map);
        // modifier un nom de l'utilisateur de la liste '
        map.get("chris");
        System.out.println(" ma nouvelle liste reactulisée est : " + map);

    }
}
