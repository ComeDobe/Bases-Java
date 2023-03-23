package Procedural.Etudiant;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int [] notes = new int[3];

        for (int i =0;  i < notes.length;  i++) {
            System.out.println(" saisir la note n°: " +(i+1));
            notes[i] = clavier.nextInt();
        }

        Etudiant etudiant = new Etudiant("Guillaume", "chris", "12/05/1990", notes, "Math Francais Anglais");
        System.out.println(" je m'appelle " + etudiant.getNom() + " " + etudiant.getPrenom()+ "\n date de naissance :" +
                "" + etudiant.getDateNaissance()+ " j'ai une moyenne de : " +etudiant.afficherMoyenne()+
                "\n pour les matieres suivantes :" +etudiant.getMatiere());
    }
}