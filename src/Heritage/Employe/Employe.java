package Heritage.Employe;

public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String dateEntree;

    public Employe(String nom, String prenom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public Employe() {

    }

    public abstract double calculerSalaire();

    public String getNom() {
        return "Employe " +nom + " " + prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateEntree='" + dateEntree + '\'' +
                '}';
    }

    public abstract double getSalaire();

    public abstract double salaire();
}
