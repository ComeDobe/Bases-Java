package Heritage.Ville;

public class Capitale extends Ville {

    private String monument;


    public Capitale(String nomVille, String nomPays, int nbreHabitants, char cathegorie, String monument) {
        super(nomVille, nomPays, nbreHabitants, cathegorie);
        this.monument = monument;

    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        return "Capitale (monument=" + monument + ")";
    }
}
