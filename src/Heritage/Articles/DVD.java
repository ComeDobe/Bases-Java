package Heritage.Articles;

public class DVD extends Articles {
    private String duree;
    private String realisateur;

    public DVD(String reference, String designation, int prix, String duree, String realisateur) {
        super(reference, designation, prix);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "DVD (duree=" + duree + ", realisateur=" + realisateur + ")";
    }

}
