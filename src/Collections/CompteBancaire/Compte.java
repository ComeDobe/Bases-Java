package Collections.CompteBancaire;

public class Compte<S> {
   private String nomProprietaire;
   private double montant;
   private  char devise;
    private double depot;

    public Compte(String nomProprietaire, double montant, char devise) {
        this.nomProprietaire = nomProprietaire;
        this.montant = montant;
        this.devise = devise;
    }

    public double alimenterCompte() {
    this.montant = montant +depot;
    return montant;
    }
    public double retirerCompte(double depot) {
    this.montant = montant -depot;
    return montant;
    }

    public void afficherInfoCompte() {
        System.out.println(" vous avez actuellement " + montant + devise+ " sur votre compte Mr: " + nomProprietaire);;

    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public char getDevise() {
        return devise;
    }

    public void setDevise(char devise) {
        this.devise = devise;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nomProprietaire='" + nomProprietaire + '\'' +
                ", montant=" + montant +
                ", devise=" + devise +
                '}';
    }

    public String getSolde() {
        return getSolde();
    }
}
