package Heritage.Cycles;

import java.time.LocalDate;

public class Velo extends Cycle {


    private int vitesse;
    private final double TARIF_LOCATION = 4.90;

    public Velo(String marque, String modele, LocalDate dateAchat, int vitesse) {
        super(marque, modele, dateAchat);
        this.vitesse = vitesse;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public double getTARIF_LOCATION() {
        return TARIF_LOCATION;
    }

    @Override
    double tarifLocation() {
        return TARIF_LOCATION;
    }
}
