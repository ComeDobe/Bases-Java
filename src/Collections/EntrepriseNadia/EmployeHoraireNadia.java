package Collections.EntrepriseNadia;

import Collections.EntrepriseNadia.EmployeNadia;

public class EmployeHoraireNadia extends EmployeNadia {
    public EmployeHoraireNadia(String nom) {
        super(nom);
        // TODO Auto-generated constructor stub
    }

    public EmployeHoraireNadia(String nom, double nbHeures, double tarifHoraire, double pourcentageHeureSup) {
        super(nom);
        this.nbHeures = nbHeures;
        this.tarifHoraire = tarifHoraire;
        this.pourcentageHeureSup = pourcentageHeureSup;
    }


    private double nbHeures=-1;
    private double tarifHoraire=-1;
    private double pourcentageHeureSup=-1;
    private static final double heureDue=39;

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
    }

    public void setTarifHoraire(double tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public void setPourcentageHeureSup(double pourcentageHeureSup) {
        this.pourcentageHeureSup = pourcentageHeureSup;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }

    public double getPourcentageHeureSup() {
        return pourcentageHeureSup;
    }

    public static double getHeuredue() {
        return heureDue;
    }

    @Override
    public double getSalaire() {
        if (nbHeures != -1 && tarifHoraire != -1 && pourcentageHeureSup != -1) {
            if (nbHeures > heureDue) {
                return tarifHoraire * (heureDue +
                        (nbHeures - heureDue)
                                * (1 + pourcentageHeureSup / 100));
            }
            else {
                return tarifHoraire * nbHeures;
            }
        }
        else {
            return -1;
        }
    }
    @Override
    public String toString() {

        return super.toString()+"nbHeures: "+ nbHeures+" "+"tarifHoraire: "+ tarifHoraire+" "+"pourcentageHeureSup: "+pourcentageHeureSup;
    }

}
