package Collections.Treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {

        Set<String > set = new TreeSet<>();
        // ajout des  éléments
        set.add("java");
        set.add("c");
        set.add("c++");
        set.add("python");
        set.add("php");

        // affichage des éléments
        System.out.println(set);
        System.out.println(" est-ce que java exist il dans la liste? " + set.contains("java"));

        // suppression des elements
        set.remove("php");
        System.out.println(" apres suppression : " + set);

        // On parcourt la liste avec l'iterateurt

        System.out.println(" iteration sur les éléments : " );
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }
    }
}
