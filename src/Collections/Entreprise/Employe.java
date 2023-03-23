package Collections.Entreprise;

class Employe implements Comparable<Employe> {

    private String nom;
    private double salaire;

    public Employe(String nom) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return nom + " (" + salaire + ")";
    }

    @Override
    public int compareTo(Employe autre) {
        return this.nom.compareTo(autre.nom);
    }
}
