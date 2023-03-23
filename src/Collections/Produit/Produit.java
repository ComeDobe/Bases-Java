package Collections.Produit;

import java.util.Objects;

public class Produit implements Comparable<Produit> {
    private String nom;
    private double prix;
    private int quantite;

    public Produit(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Double.compare(produit.prix, prix) == 0 && quantite == produit.quantite && nom.equals(produit.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix, quantite);
    }

    @Override
    public int compareTo(Produit other) {
        int compareNom = this.nom.compareTo(other.nom);
        if (compareNom != 0) {
            return compareNom;
        }
        int comparePrix = Double.compare(this.prix, other.prix);
        if (comparePrix != 0) {
            return comparePrix;
        }
        return Integer.compare(this.quantite, other.quantite);
    }
}
