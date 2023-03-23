package Heritage.Cycles;

import java.time.LocalDate;

public abstract class Cycle {
    private String marque;
    private String modele;
    private LocalDate dateAchat;


    public Cycle(String marque, String modele, LocalDate dateAchat) {

        this.marque = marque;
        this.modele = modele;
        this.dateAchat= dateAchat;

    }

    abstract double tarifLocation();

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    @Override
    public String toString() {
        return "Cycle [marque=" + marque + ", modele=" + modele + ", dateAchat=" + dateAchat + "]";
    }
}
