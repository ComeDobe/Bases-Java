package Collections.CompteBancaire;

public class Main {
    public static void main(String[] args) {
//
//        Compte<String> c1 = new Compte <>("Graven", 1000, '€');
//        Compte<String> c2 = new Compte <>("Gravende", 2000, '€');
//
//        c1.afficherInfoCompte();
//        c2.afficherInfoCompte();


        Banque bank = new Banque("Ma Banque");
        Compte compteA = new Compte("christian", 1000, '€');
        Compte compteB = new Compte("lebron", 2000, '€');

        bank.transfert(compteA, compteB, 200.0);
        System.out.println("Le solde du compte A est de " + compteA.getSolde());
        System.out.println("Le solde du compte B est de " + compteB.getSolde());

    }
}
