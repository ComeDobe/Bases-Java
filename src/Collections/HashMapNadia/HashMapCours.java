package Collections.HashMapNadia;

import java.util.*;

public class HashMapCours {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<String, Double>();

      map.put("A", 10.0);
      map.put("B", 20.0);
      map.put("C", 30.0);
      map.put("D", 40.0);
      map.put("E", 50.0);

      Set<Map.Entry<String, Double>> entries = map.entrySet();

        System.out.println( "ma chaine de caractères (String)  est : " );

      for (Map.Entry<String, Double> entry : entries) {
          System.out.println(" " + entry.getKey() );
      }

        System.out.println(" mes valeurs ( int )  sont : " );
      Collection<Double> values = map.values();
      for (Double value : values) {

          System.out.println(" " + value );
      }
        System.out.println(" on affiche la valeur de l'element :");
      String[] keys = map.keySet().toArray(new String[0]);
        System.out.println("" + map.get(keys[0]));

        // On parcourt avec l'itérateur
        System.out.println(" On affiche les elemnts avec l'iterateur : ");
        Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry= it.next();
            System.out.println(" " + entry.getKey()+ " : " + entry.getValue());
        }
    }
}
