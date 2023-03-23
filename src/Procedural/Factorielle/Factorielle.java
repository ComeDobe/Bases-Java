package Procedural.Factorielle;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int chiffre, fact= 1;

        System.out.println(" saisir un chiffre : ");
        chiffre = clavier.nextInt();

        for (int i=1; i<chiffre; i++) {
            fact = fact*i;
        }
        System.out.println(" la factorielle de : !" +chiffre+ " = " + fact);
    }
}
