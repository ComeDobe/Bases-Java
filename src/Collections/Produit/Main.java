package Collections.Produit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("salade ", 10, 100));
        produits.add(new Produit("carotte ", 5, 100));
        produits.add(new Produit("chocolat ", 2, 10));
        produits.add(new Produit("pantalon ", 1, 10));
        produits.add(new Produit("pantalon ", 1, 20));
        produits.add(new Produit("veste ", 1, 2));
        produits.add(new Produit("chemise ", 1, 2));

        Collections.sort(produits);

        System.out.println(" la liste des produits  triés est : ");

        for (Produit produit : produits) {
            System.out.println( " " + produit.getNom() + " " + produit.getPrix() + " " + produit.getQuantite());
        }
    }
}
