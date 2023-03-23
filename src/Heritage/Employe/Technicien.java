package Heritage.Employe;

public class Technicien extends Employe {
    private int  nombreUnite;
    private double   facteurUnite =5;

    public Technicien(String nom, String prenom, int age, String dateEntree, int nombreUnite) {
        super(nom, prenom, age, dateEntree);
        this.nombreUnite = nombreUnite;
    }

    public double calculerSalaire() {
        return facteurUnite * nombreUnite;
    }

    @Override
    public double getSalaire() {
        return 0;
    }

    @Override
    public double salaire() {
        return 0;
    }

    public int getNombreUnite() {
        return nombreUnite;
    }

    public void setNombreUnite(int nombreUnite) {
        this.nombreUnite = nombreUnite;
    }

    public double getFacteUnite() {
        return facteurUnite;
    }

    public void setFacteUnite(int facteUnite) {
        this.facteurUnite = facteUnite;
    }

}
