package Heritage.Employe;

public class ManutentionnaireArisque extends Manutentionnaire implements EmployeArisque{

    public ManutentionnaireArisque(String nom, String prenom, int age, String dateEntree, int heure, double salaireHoraire) {
        super(nom, prenom, age, dateEntree, heure, salaireHoraire);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire();
    }
}
