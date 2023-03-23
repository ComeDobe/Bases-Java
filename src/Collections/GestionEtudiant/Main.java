package Collections.GestionEtudiant;

import java.util.Map;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<String, Etudiant> etudiants = new HashMap<>();

            while (true) {
                System.out.println("1. Créer un étudiant");
                System.out.println("2. Ajouter une matière et une note");
                System.out.println("3. Afficher les notes");
                System.out.println("4. Afficher les matières");
                System.out.println("5. Calculer la moyenne");
                System.out.println("6. Quitter");
                System.out.print("Entrez votre choix: ");
                int choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        System.out.print("Nom de l'étudiant : ");
                        String nom = sc.next();
                        System.out.print("Prénom de l'étudiant : ");
                        String prenom = sc.next();
                        System.out.print("Matricule de l'étudiant : ");
                        String matricule = sc.next();
                        System.out.print("Email de l'étudiant : ");
                        String email = sc.next();
                        Etudiant etudiant = new Etudiant(nom, prenom, matricule, email, new HashMap<>(), new HashMap<>());
                        etudiants.put(matricule, etudiant);
                        break;
                    case 2:
                        System.out.print("Matricule de l'étudiant : ");
                        matricule = sc.next();
                        etudiant = etudiants.get(matricule);
                        if (etudiant == null) {
                            System.out.println("Erreur : l'étudiant n'existe pas");
                            break;
                        }
                        System.out.print("Nom de la matière : ");
                        String matiere = sc.next();
                        System.out.print("Coefficient de la matière : ");
                        double coefficient = sc.nextDouble();
                        etudiant.setCoefficient(matiere, coefficient);
                        break;
                    case 3:
                        System.out.print("Matricule de l'étudiant : ");
                        matricule = sc.next();
                        etudiant = etudiants.get(matricule);
                        if (etudiant == null) {
                            System.out.println("Erreur : l'étudiant n'existe pas");
                            break;
                        }
                        etudiant.afficherNotes();
                        break;
                    case 4:
                        System.out.print("Matricule de l'étudiant : ");
                        matricule = sc.next();
                        etudiant = etudiants.get(matricule);
                        if (etudiant == null) {
                            System.out.println("Erreur : l'étudiant n'existe pas");
                            break;
                        }
                        etudiant.afficherMatieres();
                        break;
                    case 5:
                        System.out.print("Matricule de l'étudiant : ");
                        matricule = sc.next();
                        etudiant = etudiants.get(matricule);
                        if (etudiant == null) {
                            System.out.println("Erreur : l'étudiant n'existe pas");
                            break;
                        }
                        etudiant.calculerMoyenne();
                        break;
                    case 6:
                        System.out.println("Au revoir");

                }
            }
        }
}


