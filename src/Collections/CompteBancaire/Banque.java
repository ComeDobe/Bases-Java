package Collections.CompteBancaire;

public class Banque<montant> {
    private String nomBanque;

    public Banque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void transfert(Compte sourceAccount, Compte targetAccount, double montant) {
        if(sourceAccount.getMontant() >= montant) {

            sourceAccount.retirerCompte(montant);
            targetAccount.alimenterCompte();
            System.out.println(sourceAccount.getMontant()+ "  a envoyé " + montant + " à " + sourceAccount.alimenterCompte());
        }
        else {
            System.out.println("Vous n'avez pas assez d'argent" + sourceAccount.getMontant()+ "n'a pas assez d'argent" + montant);
        }

    }

    }
