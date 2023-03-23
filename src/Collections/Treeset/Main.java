package Collections.Treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<>();
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(10);
        int i = ((TreeSet<Integer>) tree).pollFirst();
        System.out.println(" le premier est :  " + i);
        System.out.println(" Treeset : " + tree);
        i= ((TreeSet<Integer>) tree).pollLast();

        System.out.println(" le dernier est :  " + i);
        System.out.println(" Treeset : " + tree);

        i= 28;
        tree.add(i);
        System.out.println(" Treeset : " + tree);
    }
}
