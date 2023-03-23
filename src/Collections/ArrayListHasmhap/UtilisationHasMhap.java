package Collections.ArrayListHasmhap;

import java.util.HashMap;

public class UtilisationHasMhap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Ajout de paires clé-valeur
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);

        // Affichage de la table de hachage
        System.out.println("Table de hachage originale : " + map);
        System.out.println("---------------------------------------------------");
        // Récupération d'une valeur à partir de sa clé
        int age = map.get("Jim");
        System.out.println("Age récupéré à partir de la clé : " + age);
        System.out.println("---------------------------------------------------");
        // Suppression d'une paire clé-valeur
        map.remove("John");

        // Affichage de la table de hachage
        System.out.println("Table de hachage après la suppression : " + map);
}
}

