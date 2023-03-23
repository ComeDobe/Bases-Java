package Heritage.Employe;

public class Representant extends Commercial{

    private final static double pourcentageRepresentant = 0.2;
    private final static int bonusRepresentant= 800;

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);
    }
    public double calculerSalaire() {
        return (pourcentageRepresentant  * getChiffreAffaire()) + bonusRepresentant;
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
