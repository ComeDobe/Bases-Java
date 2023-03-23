package Heritage.Employe;

public abstract class Commercial extends Employe {

    private double chiffreAffaire;

    public Commercial(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    public Commercial(String nom, int i, int age) {
    }

    public Commercial(String nom, String prenom, int i, String s) {

    }


    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }
}
