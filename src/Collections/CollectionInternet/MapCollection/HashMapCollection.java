package Collections.CollectionInternet.MapCollection;

import java.util.*;

public class HashMapCollection {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        System.out.println(" On affiche les elements de la map : ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(" - " + entry.getKey() + " : " + entry.getValue());
        }
        // On utlise la methode contains pour vérifier si un element est dans la map
        if (map.containsValue(3)) {
            System.out.println(" - Le 3 est dans la map");
        }
        else {
            System.out.println(" - Le 3 n'est pas dans la map");
        }

        Set<String> set = map.keySet();
        System.out.println(" On affiche les chaines (String) de caracteres de la map : " + set);

        Collection<Integer> values = map.values();
        System.out.println(" On affiche les valeurs ( int ) de la map : " + values);

        // On parcourt la map avec la méthode iterator

        System.out.println(" On parcourt la map avec la méthode iterator : ");

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(" - " + entry.getKey() + " : " + entry.getValue());
        }

    }

}
