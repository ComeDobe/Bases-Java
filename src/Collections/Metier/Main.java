package Collections.Metier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SalleService salleService = new SalleService();

        salleService.create(new  Salle(1, "A001: ", "Salle de réunion"));
        salleService.create(new Salle(2, "B102 : ", "Salle informatique"));
        salleService.create(new Salle(3, "C205 : ", "Salle des maths"));
        salleService.create(new Salle(4, "D306 : ", "salle de francais"));
        salleService.create(new Salle(5, "E407 : ", "salle d'anglais"));

    // On affiche la liste des salles
        System.out.println(" Affichage de la liste de la salle :");
        for (Salle salle : salleService.findAll()) {
            System.out.println(" " + salle.getCode()+ " - " + salle.getLibelle());
        }

        // On supprime une salle"

       Salle  salleToDelete = salleService.findById(5);
        salleService.delete(salleToDelete);
        System.out.println(" liste apres Suppression de la salle : ");

        for (Salle salle : salleService.findAll()) {
            System.out.println(" " + salle.getCode()+ " - " + salle.getLibelle());
        }

        // modification de la salle
        System.out.println(" Modification des elements de la salle : ");

        Salle salleToUpdate = salleService.findById(4);
        salleToUpdate.setLibelle("Salle de francais");
        salleService.update(salleToUpdate);
        System.out.println(" salle mise à jour : ");

        for (Salle salle : salleService.findAll()) {

            System.out.println("- " +salleService.findById(4).getLibelle());
        }
    }
}

