package Collections.EntrepriseNadia;

public abstract class EmployeNadia implements Comparable<EmployeNadia> {
private String nom;
    public EmployeNadia(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double getSalaire();

    @Override
    public int compareTo(EmployeNadia o) {
        return nom.compareTo(o.getNom());
    }
}
