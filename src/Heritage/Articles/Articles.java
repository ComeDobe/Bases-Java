package Heritage.Articles;

public class Articles {

    private String reference;
    private String designation;
    private  int  prix;
    public  Articles(String reference, String designation, int prix) {

        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int  getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Articles (reference=" + reference + ", designation=" + designation + ", prix=" + prix + ")";
    }
}
