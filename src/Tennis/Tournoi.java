package Tennis;

public class Tournoi {
    private int id;
    private String nom;
    private String code;


    public Tournoi(String nom, String code) {
        this.id = id++;
        this.nom = nom;
        this.code = code;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    // Getters et setters pour les propriétés

    public void ajouterTournoi() {
        // Code pour ajouter le tournoi à la base de données
    }

    public void modifierTournoi() {
        // Code pour modifier les informations du tournoi dans la base de données
    }

    public void supprimerTournoi() {
        // Code pour supprimer le tournoi de la base de données
    }
}

