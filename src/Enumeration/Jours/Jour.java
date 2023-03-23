package Enumeration.Jours;

public enum Jour { Dimanche, Lundi, Mardi,Mercredi,Jeudi,Vendredi,Samedi;

    public static void testJour(Jour J) {
        switch (J) {
            case Lundi:
            case Mardi:
            case Mercredi:
            case Jeudi:
                System.out.println(" c'est dur le travail");
                break;
                case Vendredi:
                    System.out.println(" bientot le weekend !");
                    case Samedi:
                        System.out.println("enfin !");
                        case Dimanche:
                            System.out.println(" et ca recommence");
                            break;

        }

    }

}
