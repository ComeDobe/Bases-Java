package Heritage.Employe;

public class Vendeur extends Commercial{

    private final static double pourcentagVendeur = 0.2;
    private final static int bonusVendeur= 400;

    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);
    }

    public double calculerSalaire() {
        return (pourcentagVendeur * getChiffreAffaire()) + bonusVendeur;
    }

    @Override
    public double getSalaire() {
        return 0;
    }

    @Override
    public double salaire() {
        return 0;
    }

}
