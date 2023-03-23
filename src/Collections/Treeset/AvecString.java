package Collections.Treeset;

import java.util.Set;
import java.util.TreeSet;

public class AvecString {
    public static void main(String[] args) {
        Set<String> chaine = new TreeSet<>();

        chaine.add("Dog");
        chaine.add("Cat");
        chaine.add("Mouse");
        chaine.add("Tiger");
        chaine.add("Lion");
        chaine.add("Apple");
        chaine.add("Fox");
        chaine.add("Elephant");

        System.out.println("treeset,  ma chaine Triée  : " + chaine);
        System.out.println("Headset,  ma chaine à la partie Gauche est : " + ((TreeSet<String>) chaine).headSet("Fox"));
        System.out.println("TailSet ma,chaine à la partie Droite  : " + ((TreeSet<String>) chaine).tailSet("Fox"));
        System.out.println("SubSet, partie selectionnée : " + ((TreeSet<String>) chaine).subSet("Cat", "Fox"));
    }
}
