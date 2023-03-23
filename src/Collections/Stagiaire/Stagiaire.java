package Collections.Stagiaire;

public class Stagiaire implements Comparable<Stagiaire> {

    private String nom;
    private String prenom;

    public Stagiaire(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stagiaire autreStagiaire) {
    int compareNom = nom.compareTo(autreStagiaire.getNom());
    if (compareNom != 0) {
        return prenom.compareTo(autreStagiaire.getPrenom());
    }
        return compareNom;
    }
}

