package Procedural.Binaire;

import java.util.Scanner;

public class Binaire {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println(" saisir un nombre : ");
        int nombre = clavier.nextInt();

        System.out.println("le nombre Binaire est: " +Integer.toBinaryString(nombre));
    }
}
