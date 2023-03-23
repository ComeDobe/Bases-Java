package Heritage.Animales;

public class Chien  extends Animal{

    private double taille;

    public Chien(String nom, int pattes, String son, double taille) {
        super(nom, pattes, son);
        this.taille = taille;
    }
   public void  afficherCaracteristique () {

       System.out.println(" l'animal est de type :" +getNom() +" il a " + getPattes() +
               " pattes  son son est : " + getSon()+ " \n" +
               " sa taille est : : " + this.taille);

   }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
}
