package Procedural.Moyenne;

import java.util.Scanner;

public class Moyenne {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int [] notes = new int[3];
        String [] matieres = new String[3];
        double sommes =0;
        double moyenne =0;

        for (int i = 0; i < matieres.length ; i++) {
            System.out.println(" la matiere  n° " + (i+1) + " : ");
            matieres[i] = clavier.nextLine();
        }
        for (int i = 0; i < notes.length; i++) {
            System.out.println(" saisir la note n° " + (i+1) + " : ");
            notes[i] = clavier.nextInt();
            sommes+=notes[i];
        }
        moyenne = sommes/notes.length;
        System.out.println(" la moyenne generale est : " + moyenne);

    }
}
