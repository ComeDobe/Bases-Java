package Heritage.Employe;

public class Manutentionnaire extends Employe {
    private int heure;
    private double salaireHoraire =65;
    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heure, double salaireHoraire) {
        super(nom, prenom, age, dateEntree);
        this.heure = heure;
        this.salaireHoraire = salaireHoraire;
    }

    public double calculerSalaire() {
        return salaireHoraire* heure;
    }

    @Override
    public double getSalaire() {
        return 0;
    }

    @Override
    public double salaire() {
        return 0;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }
}
