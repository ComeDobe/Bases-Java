package Heritage.Cycles;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cycle[] cycles = {

                new Velo("velo ", " lapierre speed 400", LocalDate.of(2020, 1, 1), 27),
                new Velo("velo ", " Btwin riverside 900", LocalDate.of(2020, 1, 1), 10),
                new Gyroroue("Gyroroue ", "Immotion  V8", LocalDate.of(2021, 2, 2), 40),
                new Gyroroue("Gyroroue ", " Segway Ninebot", LocalDate.of(2021, 2, 2), 30),
                new Gyropode("Gropode ", " Weebot Echo", LocalDate.of(2022, 3, 3), 160),
                new Gyropode("Gyropode ", " Segway nie", LocalDate.of(2022, 3, 3), 150)

        };

        for (Cycle cycle : cycles) {
            System.out.println("Marque: " + cycle.getMarque() + " Modèle: " + cycle.getModele() +
                    " Date d'achat: " + cycle.getDateAchat().toString() + " Tarif de location: " + cycle.tarifLocation() + "€/heure");
        }
    }
}
