package Tennis;


public class Joueur {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;


    public Joueur(int id, String nom, String prenom, String sexe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;

    }

    public <Sexe> Joueur(int id, String nom, String prenom, Sexe s) {
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    // Getters et setters pour les propriétés

    public void ajouterJoueur() {
        // Code pour ajouter le joueur à la base de données
    }

    public void modifierJoueur() {
        // Code pour modifier les informations du joueur dans la base de données
    }

    public void supprimerJoueur() {
        // Code pour supprimer le joueur de la base de données
    }

    public int getId() {
        return  id;
    }
}

