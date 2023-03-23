package Collections.Agence;

public class Bien {
    private int id;
    private String type;
    private String adresse;
    private double prix;

    public Bien(int id, String type, String adresse, double prix) {
        this.id = id;
        this.type = type;
        this.adresse = adresse;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
