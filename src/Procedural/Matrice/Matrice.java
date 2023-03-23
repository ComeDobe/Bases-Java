package Procedural.Matrice;

import java.util.Scanner;

public class Matrice {

    public static void main(String[] args) {


        Scanner clavier = new Scanner(System.in);
        int lignes, colonnes;

        System.out.println( " saisir le nombre lignes : ");
        lignes = clavier.nextInt();

        System.out.println( " saisir le nombre lignes : ");
        colonnes = clavier.nextInt();

        int [][] Matrice1 = new int[lignes][colonnes];
        int [][] Matrice2 = new int[lignes][colonnes];
        int [][] Matrice = 	new int[lignes][colonnes];


        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes ; j++) {
                Matrice1[i][j] = (int)(Math.random()*100);

            }
        }

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes ; j++) {
                Matrice2[i][j] = (int)(Math.random()*100);
            }

        }
        System.out.println(" Affichage de la premiere matrice :");

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes ; j++) {

                System.out.print(Matrice1[i][j]+ " | ");

            }
            System.out.println();
        }
        System.out.println(" Affichage de la deuxieme matrice :");

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes ; j++) {

                System.out.print(Matrice2[i][j]+ " | ");

            }
            System.out.println();
        }

        System.out.println( " Sommes de la matrice : ");

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes ; j++) {

                Matrice [i][j] = Matrice1[i][j] + Matrice2[i][j];


                System.out.print(Matrice[i][j]+ " | ");

            }
            System.out.println();
        }
        clavier.close();
    }
}
