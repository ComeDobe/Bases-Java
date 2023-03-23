package Enumeration.TaillePoids;

import Enumeration.TaillePoids.Enumeration;

public class Main {
    public static void main(String[] args) {

        Enumeration d;
        d = Enumeration.Jack;
        System.out.println(d.toString());

        d = Enumeration.valueOf("Jack");
        System.out.println("le poids = " + d.getPoids());
        System.out.println(" la taille est = " + d.getTaille());
    }
}
