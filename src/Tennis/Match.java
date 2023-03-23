package Tennis;

public class Match {
    private Joueur joueur1;
    private Joueur joueur2;
    private String score;
    private Joueur vainqueur;
    private Tournoi tournoi;

    public Match(Joueur joueur1, Joueur joueur2, String score, Joueur vainqueur, Tournoi tournoi) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.score = score;
        this.vainqueur = vainqueur;
        this.tournoi = tournoi;
    }

    // Getters et setters pour les propriétés

    public void ajouterMatch() {
        // Code pour ajouter le match à la base de données
    }

    public void modifierMatch() {
        // Code pour modifier les informations du match dans la base de données
    }

    public void supprimerMatch() {
        // Code pour supprimer le match de la base de données
    }
}
