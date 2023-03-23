package Heritage.Articles;

public class Main {
    public static void main(String[] args) {


            Articles a1 = new Articles("A-12355-GBN-7845", "Lenovo" , 1449);
            Livre l1 = new Livre("154278", " java", 25, " AZER-785-RURUR745", 300, "DOBE Christian");
            DVD d1 = new DVD (" RYRYTT7899", "the chosen one", 100, "120min", "LEBRO JAMES");

            System.out.println(" c'est un ordinateur de ref :" +a1.getReference()+ " de marque " +a1.getDesignation()+ " au prix de :" +a1.getPrix() );
            System.out.println();

            System.out.println(" c'est un livre de ref :" +l1.getReference()+ " programmation " +l1.getDesignation()+ "\n au prix de :" +l1.getPrix()+
                    "numero isbn " +l1.getISBN()+ " le nom de l'auteur est :\n" +l1.getAuteur()+ ", le livre fait :" +l1.getPages()+ " pages");
            System.out.println();

            System.out.println(" c'est un DVD de ref :" +d1.getReference()+ " un film sur l'enfant elu de l'ohio " +d1.getDesignation()+ "\n au prix de :" +d1.getPrix()+
                    " le nom de l'auteur est :\n" +d1.getRealisateur()+ ", le livre fait :" +d1.getDuree()+ " minutes");


        }
    }

