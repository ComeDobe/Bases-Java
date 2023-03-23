package Collections.Agence;
public class Main {
    public static void main(String[] args) {
        Agence agence = new Agence("Stephane Plazza", "3 rue de scherwiller 67200 strasbourg");

        Bien b1 = new Bien(0, "Appartement", "300 Avenue de colmar 67100 strasbourg", 250000);
        Bien b2 = new Bien(1, "Appartement", "15 rue marie curry 67000 strasbourg", 150000);
        Bien b3 = new Bien(2, "Appartement", "20 rue brulée 67000 strasbourg", 200000);

        agence.ajouterBien(b1);
        agence.ajouterBien(b2);
        agence.ajouterBien(b3);

        System.out.println("Liste des biens de l'agence :");
        for (Bien bien : agence.getListeBiens()) {
            System.out.println(bien.getId() + " - " + bien.getType() + " - " + bien.getAdresse() + " - " + bien.getPrix());
        }

        try {
            agence.supprimerBien(b3);
            System.out.println("Bien retiré avec succès.");
        } catch (BienInexistantException e) {
            System.out.println(e.getMessage());
        }
    }
}
