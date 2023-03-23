package Enumeration.TaillePoids;

public enum Enumeration  {
    JOE(1.40, 52), WILLIAM (1.68,72) ,Jack(1.93, 83), Averell (2.13, 89 );

    private final double taille;
    private final double poids;

    private Enumeration(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }
   public double getTaille() {
       return  taille;
   }
   public double getPoids() {
        return  poids;
   }
   double imc() {
    return poids / (taille * taille);
    }

    @Override
    public String toString() {
        return "Enumeration{" +
                "taille=" + taille +
                ", poids=" + poids +
                '}';
    }


}
