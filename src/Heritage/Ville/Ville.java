package Heritage.Ville;

public class Ville {
    private String nomVille;
    private String nomPays;
    private int nbreHabitants;
    private char cathegorie;

    public Ville(String nomVille, String nomPays, int nbreHabitants, char cathegorie) {
        super();
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbreHabitants = nbreHabitants;
        this.cathegorie = cathegorie;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public void setNbreHabitants(int nbreHabitants) {
        this.nbreHabitants = nbreHabitants;
    }

    public char getCathegorie() {
        return cathegorie;
    }

    public void setCathegorie(char cathegorie) {
        this.cathegorie = cathegorie;
    }

    @Override
    public String toString() {
        return "Ville (nomVille=" + nomVille + ", nomPays=" + nomPays + ", nbreHabitants=" + nbreHabitants
                + ", cathegorie=" + cathegorie + ")";
    }
}
