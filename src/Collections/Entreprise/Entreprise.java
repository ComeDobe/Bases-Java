package Collections.Entreprise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Entreprise implements Iterable<Employe> {

    private String nom;
    private List<Employe> employes;

    public Entreprise(String nom) {
        this.nom = nom;
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) throws EmployePresentException {
        if (this.employes.contains(employe)) {
            throw new EmployePresentException();
        }
        this.employes.add(employe);
    }

    public void supprimerEmploye(Employe employe) throws EmployeAbsentException {
        if (!this.employes.remove(employe)) {
            throw new EmployeAbsentException();
        }
    }

    public String getNom() {
        return nom;
    }

    @Override
    public Iterator<Employe> iterator() {
        return employes.iterator();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entreprise : ");
        sb.append(nom);
        sb.append("\nEmployes : ");
        for (Employe employe : employes) {
            sb.append("\n- ");
            sb.append(employe.getNom());
        }
        return sb.toString();
}

}



