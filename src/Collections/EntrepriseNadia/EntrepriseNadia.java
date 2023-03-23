package Collections.EntrepriseNadia;

import java.util.ArrayList;
import java.util.Iterator;

public class EntrepriseNadia implements Iterable<EmployeNadia> {

    private String nom;
    private ArrayList<EmployeNadia> employe;
    private EmployeNadia emp;

    public EntrepriseNadia(String nom) {
        super();
        this.nom = nom;
        this.employe = new ArrayList<EmployeNadia>();
    }

    public void ajouterEmploye(EmployeNadia empl) throws EmployeNadiaException {

        if (employe.contains(empl)) {throw new
                EmployeNadiaException("Employ� d�j� dans cette entreprise", empl, emp);} else
            employe.add(empl);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void supprimerEmploye(EmployeNadia empl) throws EmployeNadiaException{

        if (!employe.remove(empl)) {
            throw new EmployeNadiaException("Employ� pas dans cette entreprise", empl, emp);
        }
    }

    public Iterator<EmployeNadia> iterator() {
        return employe.iterator();

    }

    @Override
    public String toString() {
        String S = " ";
        for (EmployeNadia employe : employe) {
            S = S + " " + employe.getNom();
        }
        return nom + " " + S;
    }
}
