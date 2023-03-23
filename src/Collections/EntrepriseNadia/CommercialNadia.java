package Collections.EntrepriseNadia;

public class CommercialNadia extends EmployeNadia {
    private double ca=-1.0;
    private double fixe=-1.0;
    public static final  double pourcentageca=1;


    public CommercialNadia(String nom, double ca, double fixe) {
        super(nom);
        this.ca = ca;
        this.fixe = fixe;

    }


    public CommercialNadia(String nom) {
        super(nom);
    }



    public void setCa(double ca) {
        if (ca>=0)
            this.ca = ca;
    }


    public void setFixe(double fixe) {
        if(fixe>=0)
            this.fixe = fixe;
    }



    @Override
    public double getSalaire() {
        if((ca!=-1)&& (fixe!=0)){
            return fixe+pourcentageca*ca/100;
        }
        else {
            return -1;}
    }
    @Override
    public String toString() {

        return super.toString()+" "+ "fixe "+ fixe+ "ca " +ca;
    }

}
