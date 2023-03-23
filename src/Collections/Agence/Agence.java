package Collections.Agence;

import java.util.ArrayList;
public class Agence {
    private String nom;
    private String adresse;
    private ArrayList<Bien> listeBiens;

    public Agence(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.listeBiens = new ArrayList<Bien>();
    }

    public void ajouterBien(Bien bien) {
        this.listeBiens.add(bien);
    }

    public void supprimerBien(Bien bien) throws BienInexistantException {
        if (!this.listeBiens.remove(bien)) {
            throw new BienInexistantException("Le bien à supprimer n'existe pas en agence.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Bien> getListeBiens() {
        return listeBiens;
    }

    public void setListeBiens(ArrayList<Bien> listeBiens) {
        this.listeBiens = listeBiens;
    }
}
