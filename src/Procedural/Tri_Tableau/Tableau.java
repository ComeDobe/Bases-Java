package Procedural.Tri_Tableau;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int [] tableau = new int[5];

        System.out.println(" saisir les elements du tableau :");

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = clavier.nextInt();
        }
        System.out.println(" les elements du tableau sont :");

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]+ " ");
        }
        Arrays.sort(tableau);
        System.out.println();
        System.out.println(" le tableau trié est : " + Arrays.toString(tableau));
    }
}
