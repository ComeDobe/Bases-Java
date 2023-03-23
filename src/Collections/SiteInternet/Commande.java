package Collections.SiteInternet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {

    private int comp_id =0;
    private int id;
    private Date date;
    private List<Produit> listeProduits;
    private double montant;

    public Commande() {

        this.id = ++comp_id;
        this.date = date;
        this.listeProduits = new ArrayList<Produit>();
        this.montant = 0;
    }

    public void ajouterProduit(Produit p){
        this.listeProduits.add(p);
    }
    public void retirerProduit(Produit p){
        listeProduits.remove(p);
    }
    public double calculerMontant(){
        double montant = 0;
        for(Produit p : listeProduits){
            montant += p.getPrix();
        }
        this.montant = montant;
        return montant;
    }
    public void afficherDetails(){
        System.out.println(" Commande ID : "+this.id);
        System.out.println(" Date : "+this.date);
        System.out.println(" Produits : ");

        for(Produit p : listeProduits){
            System.out.println(" Produit ID : "+p.toString());
        }
        System.out.println(" le montant : "+this.montant);
    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Produit> getProduits() {
        return listeProduits;
    }

    public void setProduits(List<Produit> produits) {
        this.listeProduits = produits;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setCompteurId(int i) {
    }
}
