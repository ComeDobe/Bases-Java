package Heritage.Animales;

public class Animal {
    private String nom;
    private int pattes;
    private String son;

    public Animal(String nom, int pattes, String son) {
        this.nom = nom;
        this.pattes = pattes;
        this.son = son;
    }

    public void  afficherCaracteristique () {

        System.out.println(" l'animal est de type :" +this.nom+ " il a " + this.pattes + " son son est : " + this.son);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPattes() {
        return pattes;
    }

    public void setPattes(int pattes) {
        this.pattes = pattes;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }
}
