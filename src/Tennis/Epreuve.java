package Tennis;

import java.util.List;

public class Epreuve {

    private int annee;
    private char type_epreuve;
    private int id_tournoi;

    public Epreuve(int annee, char type_epreuve, int id_tournoi) {
        this.annee = annee;
        this.type_epreuve = type_epreuve;
        this.id_tournoi = id_tournoi;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public char getType_epreuve() {
        return type_epreuve;
    }

    public void setType_epreuve(char type_epreuve) {
        this.type_epreuve = type_epreuve;
    }

    public int getId_tournoi() {
        return id_tournoi;
    }

    public void setId_tournoi(int id_tournoi) {
        this.id_tournoi = id_tournoi;
    }
}
