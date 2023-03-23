package Procedural.Etudiant;

import java.util.Arrays;

public class Etudiant {

    private String nom;
    private String prenom;
    private String dateNaissance;
    public int [] notes ;
    private String matiere;

    public Etudiant(String nom, String prenom, String dateNaissance, int[] notes, String matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.notes = notes;
        this.matiere = matiere;
    }

    public String getNom() {
        return nom;
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public  String afficherNomComplet() {
        return "( Nom : " + this.nom+ "\n Prenom : " + this.prenom + "\n Date de naiss :" +this.dateNaissance  ;
    }
    public double afficherMoyenne() {

        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }

    @Override
    public String toString() {
        return "Procedural.Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", notes=" + Arrays.toString(notes) +
                ", matiere='" + matiere + '\'' +
                '}';
    }
}

