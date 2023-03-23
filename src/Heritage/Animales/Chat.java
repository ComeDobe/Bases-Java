package Heritage.Animales;

public class Chat extends  Animal{

    private String couleurPoils;

    public Chat(String nom, int pattes, String son, String couleurPoils) {
        super(nom, pattes, son);
        this.couleurPoils = couleurPoils;
    }

    public void afficherCaracteristique () {

        System.out.println(" l'animal est de type :" +getNom() +" il a " + getPattes() + " \n " +
                " pattes son son est : " + getSon()+ " sa couleur de poils est : " + this.couleurPoils);

    }

    public String getCouleurPoils() {
        return couleurPoils;
    }

    public void setCouleurPoils(String couleurPoils) {
        this.couleurPoils = couleurPoils;
    }
}
