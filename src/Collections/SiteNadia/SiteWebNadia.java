package Collections.SiteNadia;

import java.util.ArrayList;
import java.util.List;

public class SiteWebNadia {

    private String nom;
    private String adresse;
    private List<CommandeNadia> listeCommandes;

    public SiteWebNadia(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.listeCommandes = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public CommandeNadia passerCommande() {
        CommandeNadia nouvelleCommande = new CommandeNadia();
        this.listeCommandes.add(nouvelleCommande);
        return nouvelleCommande;
    }
    public void afficherCommandes() {
        for (CommandeNadia commande : this.listeCommandes) {
            commande.afficherDetails();
        }
    }

    public void modifierCommande(CommandeNadia commande) {
        int index = this.listeCommandes.indexOf(commande);
        if (index >= 0) {
            this.listeCommandes.set(index, commande);
        }
    }
}
