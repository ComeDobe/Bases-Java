package Collections.EntrepriseNadia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainNadia {

    public static <CompareSalaireDecroissant> void main(String[] args) throws EmployeNadiaException {

        EntrepriseNadia e1 = new EntrepriseNadia("IBM");
        EntrepriseNadia e2 = new EntrepriseNadia("Sun");

        EmployeNadia p = new EmployeHoraireNadia("testsupression", 42, 75.00, 0.25);
        e1.ajouterEmploye(new EmployeHoraireNadia("Poiret", 42, 75.00, 0.25));
        e1.ajouterEmploye(new CommercialNadia("Dupond", 5000, 50000));
        e1.ajouterEmploye(p);
        //e1.ajouterEmploye(p);
        e2.ajouterEmploye(new CommercialNadia("Ravier", 6000, 40000));
        e2.ajouterEmploye(new EmployeHoraireNadia("Burot", 45, 105.00, 0.1));
        e2.ajouterEmploye(new CommercialNadia("Terrice", 3000, 70000));
        e2.ajouterEmploye(new EmployeHoraireNadia("Pernaut", 32, 125.00, 0.2));
        e1.supprimerEmploye(p);
        System.out.println(e1);
        System.out.println(e2);

        Iterator<EmployeNadia> it = e1.iterator();
        double totalSalaire = 0;
        while (it.hasNext()) {
            totalSalaire = totalSalaire + it.next().getSalaire();
        }
        System.out.println("Total des salaires pour les employes de " + e1.getNom() + " = " + totalSalaire);
        // Total salaire e1
        totalSalaire = 0;

        it = e2.iterator();
        while (it.hasNext()) {

            totalSalaire = totalSalaire + it.next().getSalaire();

        }
        System.out.println("Total des salaires pour les employes de " + e2.getNom() + " = " + totalSalaire);

        // tri par ordre alphabetique des employ�s de e1
        ArrayList<EmployeNadia> l = new ArrayList<EmployeNadia>();

        it = e1.iterator();
        while (it.hasNext()) {
            l.add(it.next());
        }

        Collections.sort(l);
        System.out.println("Employes de " + e1.getNom() + " par ordre alphabetique");
        for (EmployeNadia employe : l) {
            System.out.println(employe.getNom());
        }

        // tri par ordre croissant
        CompareSalaireCroissant cmp = new CompareSalaireCroissant();
        Collections.sort(l, cmp);
        System.out.println("Employes de " + e1.getNom() + " par ordre croissant des salaires");
        for (EmployeNadia employe : l) {
            System.out.println(employe.getNom() + " gagne " + employe.getSalaire());
        }
        // tri par ordre decroissant

       // CompareSalaireDecroissant cmp2 = new CompareSalaireDecroissant();
        //Collections.sort(l, cmp2);
        Collections.sort(l);
        System.out.println("Employes de " + e1.getNom() + " par ordre decroissant des salaires");
        for (EmployeNadia employe : l) {
            System.out.println(employe.getNom() + " gagne " + employe.getSalaire());
        }

        // tri par ordre alphabetique des employ�s de e1 et e2

        it = e2.iterator();
        while (it.hasNext()) {
            l.add(it.next());
        }
        Collections.sort(l);
        System.out.println("Employes de " + e1.getNom() + " Employes de " + e2.getNom() + " par ordre alphabetique");
        for (EmployeNadia employe : l) {
            System.out.println(employe.getNom());
        }

        System.out.println("trie decroissant sans changer le Comparator");
        Collections.sort(l, (o2, o1) -> o1.compareTo(o2));
        for (EmployeNadia employe : l) {
            System.out.println(employe.getNom());
        }
    }

}
