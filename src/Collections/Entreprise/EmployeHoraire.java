package Collections.Entreprise;

class EmployeHoraire extends Employe {

    private int heuresTravaillees;
    private double tauxHoraire;
    private double tauxSupplementaire;

    public EmployeHoraire(String nom, int heuresTravaillees, double tauxHoraire, double tauxSupplementaire) {
        super(nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
        this.tauxSupplementaire = tauxSupplementaire;
    }

    @Override
    public double getSalaire() {
        double salaire = heuresTravaillees * tauxHoraire;
        if (heuresTravaillees > 40) {
            salaire += (heuresTravaillees - 40) * tauxHoraire * tauxSupplementaire;
        }
        return salaire;
    }
}