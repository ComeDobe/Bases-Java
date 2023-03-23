package Hascode;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Client c1,c2;
        LocalDate dateNaissance = LocalDate.of(1980, 1, 1);
        c1 = new Client("Toto","Titi",dateNaissance);
        c2 = new Client("Tata","Tata",dateNaissance);
        if(c1.equals(c2)){
            System.out.println("Pareil");
        } else {
            System.out.println("Different");
        }
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
