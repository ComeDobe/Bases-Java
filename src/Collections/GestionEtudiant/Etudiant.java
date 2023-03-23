package Collections.GestionEtudiant;

import java.util.Map;

public class Etudiant {

    private String nom;
    private String prenom;
    private String matricule;
    private String email;
    private Map<String, Double> notes;
    private Map<String, Double> coefficients;

    public Etudiant(String nom, String prenom, String matricule, String email, Map<String, Double> notes, Map<String, Double> coefficients) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.email = email;
        this.notes = notes;
        this.coefficients = coefficients;
    }

    public void afficherNotes(){
        System.out.println(" saisir les notes de l'etudiant " +nom+  " " + prenom);

        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(" " + entry.getKey() + " : " + entry.getValue());
        }
     }

     public boolean afficherMatieres(){
         System.out.println(" saisir les matieres de l'etudiant " +nom+  " "+ prenom);

         for (Map.Entry<String, Double> entry : coefficients.entrySet()) {
             System.out.println(" " + entry.getKey() + " : " + entry.getValue());
         }
         return false;
     }

     public void calculerMoyenne(){
        double moyenne = 0;
        double total = 0;

        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            total += entry.getValue()*coefficients.get(entry.getKey());
        }
        moyenne = total/notes.size();
         System.out.println(" la moyenne de l'etudiant " +nom+  " " + prenom + " est : " + moyenne);
     }
     public void setNotes(String matiere, double note){
        notes.put(matiere, note);
     }

     public void setCoefficient(String matiere, double coefficient){
        coefficients.put(matiere, coefficient);
     }
}
