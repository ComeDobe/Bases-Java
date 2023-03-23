package Heritage.Cycles;

import java.time.LocalDate;

public class Gyroroue extends Cycle{
    private int autonomie;
    private final double TARIF_LOCATION = 18.90;

    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat);
        this.autonomie = autonomie;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    public double getTARIF_LOCATION() {
        return TARIF_LOCATION;
    }

    @Override
    double tarifLocation() {
        return TARIF_LOCATION;
    }

}
