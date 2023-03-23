package Collections.Entreprise;

class Commercial extends Employe {

    private double ventes;
    private double commission;

    public Commercial(String nom, double ventes, double commission) {
        super(nom);
        this.ventes = ventes;
        this.commission = commission;
    }

    @Override
    public double getSalaire() {
        return commission + 0.01 * ventes;
    }
}

