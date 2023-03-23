package Heritage.Articles;

public class Personne {

    private String nonm;
    private String prenonm;
    private String dateNaissance;

    public Personne(String nonm, String prenonm, String dateNaissance) {

        this.nonm = nonm;
        this.prenonm = prenonm;
        this.dateNaissance = dateNaissance;
    }

    public String getNonm() {
        return nonm;
    }

    public void setNonm(String nonm) {
        this.nonm = nonm;
    }

    public String getPrenonm() {
        return prenonm;
    }

    public void setPrenonm(String prenonm) {
        this.prenonm = prenonm;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne (nonm=" + nonm + ", prenonm=" + prenonm + ", dateNaissance=" + dateNaissance + ")";
    }

}
