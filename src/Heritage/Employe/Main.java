package Heritage.Employe;

public class Main {

    public static void main(String[] args) {

        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("lebron", "Jmaes", 38, "2023", 30000));
        p.ajouterEmploye(new Representant("Chris", "Dobe", 35, "2022", 20000));
        p.ajouterEmploye(new Technicien("Chad", "Dobe", 24, "2018", 1000));
        p.ajouterEmploye(new Commercial("Chad", "Dobe", 24, "2018", 15010) {
            @Override
            public double calculerSalaire() {
                return 0;
            }

            @Override
            public double getSalaire() {
                return 0;
            }

            @Override
            public double salaire() {
                return 0;
            }
        });
       // p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnicienArisque("Come", "Pina", 18, "2022", 1000));
       // p.ajouterEmploye(new ManutentionnaireArisque("Al", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " euro.");
    }
}
