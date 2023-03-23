package Heritage.Cycles;

import java.time.LocalDate;

public class Gyropode extends Cycle {

    private int tailleMin;
    private final double TARIF_LOCATION = 29.90;

    public Gyropode(String marque, String modele, LocalDate dateAchat, int tailleMin) {
        super(marque, modele, dateAchat);
        this.tailleMin = tailleMin;
    }

    public int getTailleMin() {
        return tailleMin;
    }

    public void setTailleMin(int tailleMin) {
        this.tailleMin = tailleMin;
    }

    public double getTARIF_LOCATION() {
        return TARIF_LOCATION;
    }
    @Override
    double tarifLocation() {
        return TARIF_LOCATION;
    }
}
