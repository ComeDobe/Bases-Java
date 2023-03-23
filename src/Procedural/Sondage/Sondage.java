package Procedural.Sondage;

import java.util.Scanner;

public class Sondage {

    public static int nbrfemmes(int [][] tab) {
        return tab [1][0] + tab [1][1] +tab [1][2];
    }
    public static int nbrhommes(int [][] tab) {
        return tab [0][0] + tab [0][1] +tab [0][2];
    }

    public static int  nbrTotalPersonne(int [][] tab, String vote) {
        if ((vote=="oui")) {
            return tab [0][0]+ tab [0][1];
        }
        else if ((vote=="non")) {
            return tab [0][1]+ tab [1][1];
        }
        else if ((vote=="abstention")) {
            return tab [0][2]+ tab [1][2];
        }
        else
            return -1;
    }
    public static String preditResultat(int [][] tab) {

        if(tab [0][0]+ tab [0][1] > tab [0][1]+ tab [1][1])
            return "oui a gagné ";

        else if(tab [0][0]+ tab [0][1] < tab [0][1]+ tab [1][1])
            return "non a gagné";

        else
            return " egalité";
    }
    public static String femmeEthommeEquitable(int [][] tab) {

        if ((tab [0][0]+tab [0][1]+tab [0][2])== (tab [1][0]+tab [1][1]+tab [1][2]))

            return " Equitable ";

        else
            return " non equitable";
    }


    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int [][]votes = new int [2][3];


        System.out.println(" saisir nombre de vote hommeOui :");
        votes [0][0] = clavier.nextInt();

        System.out.println(" saisir nombre de vote hommeNon :");
        votes [0][1] = clavier.nextInt();

        System.out.println(" saisir nombre de vote AbstentionHomme :");
        votes [0][2] = clavier.nextInt();


        System.out.println(" saisir nombre de vote femmeOui :");
        votes [1][0] = clavier.nextInt();

        System.out.println(" saisir nombre de vote femmeNon :");
        votes [1][1] = clavier.nextInt();

        System.out.println(" saisir nombre de vote AbstentionFemme :");
        votes [1][2] = clavier.nextInt();

        System.out.println( " le nombre de vote des femmes est :" +nbrfemmes(votes));
        System.out.println( " le nombre de vote des hommes est :" +nbrhommes(votes));
        System.out.println( " le nombre total ayant une intention de voter oui est :" +nbrTotalPersonne(votes, "oui"));
        System.out.println( " le nombre total ayant une intention de voter non est :" +nbrTotalPersonne(votes, "non"));
        System.out.println( " le nombre total ayant une intention de s'abstenir  est :" +nbrTotalPersonne(votes, "abstention"));
        System.out.println("la prediction des votes est: " +preditResultat(votes));
        System.out.println( " les hommes et les femmes sont : "+femmeEthommeEquitable(votes));
    }
}
