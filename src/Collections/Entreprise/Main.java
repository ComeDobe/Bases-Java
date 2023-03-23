package Collections.Entreprise;

import java.util.*;

public class Main {
    public static void main(String[] args) throws EmployePresentException {

// Partie I
        Entreprise entreprise1 = new Entreprise("BMW");
        Entreprise entreprise2 = new Entreprise("MERCEDEZ");

        Employe employe1 = new Employe("LEBRON");
        Employe employe2 = new Employe("KOBE");
        Employe employe3 = new Employe("MAGIC");

        try {
            entreprise1.ajouterEmploye(employe1);
            entreprise1.ajouterEmploye(employe2);
            entreprise2.ajouterEmploye(employe2);
            entreprise2.ajouterEmploye(employe3);
        } catch (EmployePresentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(entreprise1);
        System.out.println(entreprise2);

        try {
            entreprise1.supprimerEmploye(employe2);
            entreprise2.supprimerEmploye(employe1);
            entreprise2.supprimerEmploye(employe3);
            entreprise2.supprimerEmploye(new Employe("Inconnu"));
        } catch (EmployeAbsentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(entreprise1);
        System.out.println(entreprise2);

// Partie II

        Entreprise ibm = new Entreprise("IBM");
        ibm.ajouterEmploye(new EmployeHoraire("Poiret", 42, 75.00, 0.25));
        ibm.ajouterEmploye(new Commercial("Dupond", 5000, 50000));

        System.out.println(ibm);

        Entreprise sun = new Entreprise("SUN");
        sun.ajouterEmploye(new Commercial("Ravier", 6000, 40000));
        sun.ajouterEmploye(new EmployeHoraire("Burot", 45, 105.00, 0.1));
        sun.ajouterEmploye(new Commercial("Terriee", 3000, 70000));
        sun.ajouterEmploye(new EmployeHoraire("Pernaut", 32, 125.00, 0.2));

        System.out.println(sun);


        // Partie III

//        Entreprise ibm = new Entreprise("IBM");
//        Entreprise sun = new Entreprise("SUN");

        try {
            ibm.ajouterEmploye(new EmployeHoraire("Poiret", 42, 75.00, 0.25));
            ibm.ajouterEmploye(new Commercial("Dupond", 5000, 50000));
            sun.ajouterEmploye(new Commercial("Ravier", 6000, 40000));
            sun.ajouterEmploye(new EmployeHoraire("Burot", 45, 105.00, 0.1));
            sun.ajouterEmploye(new Commercial("Terriee", 3000, 70000));
            sun.ajouterEmploye(new EmployeHoraire("Pernaut", 32, 125.00, 0.2));
        } catch (EmployePresentException e) {
            System.out.println(e.getMessage());
        }

        double totalSalairesIBM = 0;
        Iterator<Employe> iterIBM = ibm.iterator();
        while (iterIBM.hasNext()) {
            Employe employe = iterIBM.next();
            totalSalairesIBM += employe.getSalaire();
        }
        System.out.println("Total des salaires de l'entreprise IBM : " + totalSalairesIBM);

        double totalSalairesSUN = 0;
        for (Employe employe : sun) {
            totalSalairesSUN += employe.getSalaire();
        }
        System.out.println("Total des salaires de l'entreprise SUN : " + totalSalairesSUN);

        List<Employe> employesSun = new ArrayList<>((Collection) sun.iterator());
        Collections.sort(employesSun);
        System.out.println("Liste des employés de l'entreprise SUN, par ordre alphabétique :");

        for (Employe employe : employesSun) {
           System.out.println(employe.getNom() + " : " + employe.getSalaire());

            //partie IV

            ibm.ajouterEmploye(new EmployeHoraire("Poiret", 42, 75.00, 0.25));
            ibm.ajouterEmploye(new Commercial("Dupond", 5000, 50000));

            //Entreprise sun = new Entreprise("SUN");
            sun.ajouterEmploye(new Commercial("Ravier", 6000, 40000));
            sun.ajouterEmploye(new EmployeHoraire("Burot", 45, 105.00, 0.1));
            sun.ajouterEmploye(new Commercial("Terriee", 3000, 70000));
            sun.ajouterEmploye(new EmployeHoraire("Pernaut", 32, 125.00, 0.2));

            // Afficher les noms et salaires des employés d'une entreprise, triés par ordre alphabétique
            System.out.println("Employés de l'entreprise IBM par ordre alphabétique:");
            ArrayList<Employe> ibmEmployes = (ArrayList<Employe>) ibm.getEmployes();
            Collections.sort(ibmEmployes);
//            for (Employe employe : ibmEmployes) {
//                System.out.println(employe.getNom() + " : " + employe.getSalaire());
//            }

            // Afficher les noms et salaires des employés d'une entreprise, triés par salaire décroissant puis croissant
            System.out.println("\nEmployés de l'entreprise SUN par salaire décroissant puis croissant:");
            ArrayList<Employe> sunEmployes = (ArrayList<Employe>) sun.getEmployes();
            Comparator<Employe> comparator = new Comparator<Employe>() {
                @Override
                public int compare(Employe e1, Employe e2) {
                    double diff = e2.getSalaire() - e1.getSalaire();
                    if (diff != 0) {
                        return (int) diff;
                    }
                    return (int) (e1.getSalaire() - e2.getSalaire());
                }
            };
//            Collections.sort(sunEmployes, comparator);
//           for (Employe employe : sunEmployes) {
//                System.out.println(employe.getNom() + " : " + employe.getSalaire());
//           }

            // Afficher les noms de tous les employés des 2 entreprises, triés par ordre alphabétique
            System.out.println("\nTous les employés des 2 entreprises par ordre alphabétique:");
            ArrayList<Employe> tousEmployes = new ArrayList<>();
            tousEmployes.addAll(ibm.getEmployes());
            tousEmployes.addAll(sun.getEmployes());
            Collections.sort(tousEmployes);
//            for (Employe employe : tousEmployes) {
//                System.out.println(employe.getNom());
//
//            }
        }
    }
}




