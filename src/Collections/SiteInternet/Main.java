package Collections.SiteInternet;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        SiteWeb siteWeb = new SiteWeb("Mon site web", "https://www.monsiteweb.com");

        // Création de produits
        Produit produit1 = new Produit("Produit 1", 10.0);
        Produit produit2 = new Produit("Produit 2", 20.0);
        Produit produit3 = new Produit("Produit 3", 30.0);

        // Création d'une commande
        Commande commande1 = new Commande();
        commande1.setCompteurId(1);
        commande1.setDate(new Date());
        commande1.ajouterProduit(produit1);
        commande1.ajouterProduit(produit2);

        // Ajout de la commande au site web
        siteWeb.passerCommande();

        // Création d'une deuxième commande
        Commande commande2 = new Commande();
        commande2.setCompteurId(2);
        commande2.setDate(new Date());
        commande2.ajouterProduit(produit2);
        commande2.ajouterProduit(produit3);

        // Ajout de la deuxième commande au site web
        siteWeb.passerCommande();

        // Affichage des commandes du site web
        siteWeb.afficherCommandes();

        // Modification de la deuxième commande (retrait d'un produit)
        commande2.retirerProduit(produit3);

        // Mise à jour de la commande sur le site web
        siteWeb.modifierCommande(commande2);

        // Calcul du montant de la première commande
        double montantCommande1 = commande1.calculerMontant();
        System.out.println("Montant de la commande 1 : " + montantCommande1);

        // Affichage des détails de la première commande
        commande1.afficherDetails();
    }
}
