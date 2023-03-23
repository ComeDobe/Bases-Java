package Collections.SiteNadia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommandeNadia {

    private static int compteurId = 0;
    private int id;
    private Date date;
    private List<ProduitNadia> listeProduits;
    private double montant;

    public CommandeNadia() {
        this.id = ++compteurId;
        this.date = new Date();
        this.listeProduits = new ArrayList<>();
        this.montant = 0;
    }

    public void ajouterProduit(ProduitNadia produit) {
        this.listeProduits.add(produit);
        this.montant += produit.getPrix();
    }
    public void retirerProduit(ProduitNadia produit) {
        if (this.listeProduits.remove(produit)) {
            this.montant -= produit.getPrix();
        }
    }

    public double calculerMontant() {
        return this.montant;
    }

    public void afficherDetails() {
        System.out.println("Commande #" + this.id + " pass�e le " + this.date.toString());
        System.out.println("Produits : ");
        for (ProduitNadia produit : this.listeProduits) {
            System.out.println(produit.getNom() + " (" + produit.getPrix() + " euros)");
        }
        System.out.println("Montant total : " + this.montant + " euros");
    }
}
