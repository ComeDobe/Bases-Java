package Collections.SiteInternet;

import java.util.ArrayList;

public class SiteWeb {
    private String nom;
    private String url;
    private ArrayList<Commande> commandes;

    public SiteWeb(String nom, String url) {
        this.nom = nom;
        this.url = url;
        this.commandes = commandes;
    }
    public Commande passerCommande(){
        Commande nouvelleCommande = new Commande();
        this.commandes.add(nouvelleCommande);
        return nouvelleCommande;
    }
    public void modifierCommande(Commande commande){
        commandes.set(commandes.indexOf(commande),commande);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "SiteWeb{" +
                "nom='" + nom + '\'' +
                ", url='" + url + '\'' +
                ", commandes=" + commandes +
                '}';
    }

    public void afficherCommandes(){
        for(Commande commande : commandes){
            System.out.println("Commande : " + commande);
        }

    }
}
