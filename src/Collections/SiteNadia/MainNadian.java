package Collections.SiteNadia;

public class MainNadian {


    public static void main(String[] args) {
        // Cr�ation de deux sites web
        SiteWebNadia site1 = new SiteWebNadia("Site 1", "www.site1.com");
        SiteWebNadia site2 = new SiteWebNadia("Site 2", "www.site2.com");

        // Cr�ation de quelques produits
        ProduitNadia produit1 = new ProduitNadia("Produit 1", 10.0);
        ProduitNadia produit2 = new ProduitNadia("Produit 2", 20.0);
        ProduitNadia produit3 = new ProduitNadia("Produit 3", 30.0);

        // Passage de commandes sur les sites web
        CommandeNadia commande1 = site1.passerCommande();
        commande1.ajouterProduit(produit1);
        commande1.ajouterProduit(produit2);
        commande1.ajouterProduit(produit3);

        CommandeNadia commande2 = site2.passerCommande();
        commande2.ajouterProduit(produit1);
        commande2.ajouterProduit(produit3);
        // Modification de la commande 1
        commande1.retirerProduit(produit2);
        commande1.ajouterProduit(produit2);

        // Affichage des commandes de chaque site web
        System.out.println("Commandes passées sur " + site1.getNom() + " : ");
        site1.afficherCommandes();

        System.out.println("Commandes passées sur " + site2.getNom() + " : ");
        site2.afficherCommandes();

    }
}
