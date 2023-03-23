package Heritage.Ville;

public class Main {

    public static void main(String[] args) {

        Ville v1 = new Ville("Metz", "France", 100000, 'C');
        Capitale c1 = new Capitale(" Bruxelle", "Belgique", 200000, 'A', "Atomium");

        System.out.println(v1.getNomVille()+ " est une ville de " +v1.getNomPays()+ " elle comporte " +v1.getNbreHabitants()+
                " \n habitants et elle est de cathegorie :" +v1.getCathegorie());

        System.out.println();

        System.out.println(c1.getNomVille()+ " est une ville de " +c1.getNomPays()+ " elle comporte " +c1.getNbreHabitants()+
                " \n habitants et elle est de cathegorie :" +c1.getCathegorie()+ ", " +c1.getMonument()+ " est un monument à visiter");

        Ville [] tabville = new Ville [5];


        Ville v2 = new Ville("Strabourg", "France", 100000, 'C');
        Ville v3 = new Ville("Paris", "France", 10000000, 'E');
        Ville v4 = new Ville("Lyon ", "France", 8000000, 'G');
        Ville v5 = new Ville("Lille", "France", 500000, 'H');

        tabville[0] = v1;
        tabville[1] = v2;
        tabville[2] = v3;
        tabville[3] = v4;
        tabville[4] = v5;

        System.out.println();
        System.out.println(" les villes sont :");

        for (Ville ville : tabville) {

            System.out.println(ville.getNomVille());



        }
}
}

