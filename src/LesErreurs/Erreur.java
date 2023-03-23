package LesErreurs;

import java.util.Scanner;

public class Erreur {

    public static int calcule(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println(" saisir la valeur de a: ");
        int a = clavier.nextInt();

        System.out.println(" saisir la valeur de b: ");
        int b = clavier.nextInt();

        int resultat= 0;
        try {
            resultat = calcule(a, b);
        }
        catch (ArithmeticException e) {
            //System.out.println("Division par 0");
            System.out.println(e.getMessage()+ ": Division par 0") ;
            System.out.println(e.toString());
           // e.printStackTrace();
        }
        System.out.println("resultat = " + resultat);
    }
}
