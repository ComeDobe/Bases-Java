package Heritage.Employe;

public class TechnicienArisque extends Technicien implements EmployeArisque{

    public TechnicienArisque(String nom, String prenom, int age, String dateEntree, int nombreUnite) {
        super(nom, prenom, age, dateEntree, nombreUnite);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() +prime;
    }
}
