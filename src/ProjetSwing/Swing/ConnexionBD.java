//package ProjetSwing.Swing;
//
//import Tennis.Joueur;
////import jdk.internal.icu.text.UnicodeSet;
//
//import javax.swing.table.DefaultTableModel;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class ConnexionBD {
//    private Connection conn;
//    private String url = "jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
//   private String user = "root";
//   private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
//   private DefaultTableModel tableJoueurs = new DefaultTableModel();
//    private String password = "";
////    private DefaultTableModel tableModel;
//
//    public ConnexionBD() {
//        try {
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connexion à la base de données réussie.");
//        } catch (SQLException e) {
//            System.out.println("Connexion à la base de données échouée : " + e.getMessage());
//        }
//    }
//
//    public Connection getConn() {
//        return conn;
//    }
//
//    public void fermerConnexion() {
//        try {
//            if (conn != null) {
//                conn.close();
//                System.out.println("Connexion à la base de données fermée.");
//            }
//        } catch (SQLException e) {
//            System.out.println("Fermeture de la connexion à la base de données échouée : " + e.getMessage());
//        }
//    }
//
//    public ResultSet listeJoueur() {
//        ResultSet resultat = null;
//        String requete = "SELECT * FROM joueur";
//        try {
//            Statement statement = conn.createStatement();
//           // resultat = statement.executeQuery(requete);
//            ResultSet rs = statement.executeQuery(requete);
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String nom = rs.getString("nom");
//                String prenom = rs.getString("prenom");
//                String sexe = rs.getString("sexe");
//                Joueur joueurs = new Joueur(id, nom, prenom, sexe);
//                joueur.add(joueur);
//                Object[] row = {id, nom, prenom, sexe};
//                tableModel.addRow(row);
//            }
//        } catch (SQLException e) {
//            System.out.println("Erreur lors de la récupération des joueurs : " + e.getMessage());
//        }
//        return resultat;
//    }
//
////    public ResultSet rechercherJoueurs(String recherche) {
////        ResultSet resultat = null;
////        String requete = "SELECT * FROM joueur WHERE nom LIKE '%" + recherche + "%' OR prenom LIKE '%" + recherche + "%'";
////        try {
////            Statement statement = conn.createStatement();
////            resultat = statement.executeQuery(requete);
////        } catch (SQLException e) {
////            System.out.println("Erreur lors de la recherche des joueurs : " + e.getMessage());
////        }
////        return resultat;
////    }
//
//    public ResultSet rechercherJoueur(String recherche) {
//        ResultSet resultat = null;
//        String requete = "SELECT * FROM joueur WHERE id = " + recherche;
//        try {
//            Statement statement = conn.createStatement();
//            resultat = statement.executeQuery(requete);
//        } catch (SQLException e) {
//            System.out.println("Erreur lors de la recherche du joueur : " + e.getMessage());
//        }
//        return resultat;
//    }
//
//    public void ajouterJoueur(String nom, String prenom, String sexe) {
//        String requete = "INSERT INTO joueur (nom, prenom, sexe) VALUES (?, ?, ?)";
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(requete);
//            preparedStatement.setString(1, nom);
//            preparedStatement.setString(2, prenom);
//            preparedStatement.setString(3, sexe);
//            preparedStatement.executeUpdate();
//            System.out.println("Le joueur a été ajouté à la base de données.");
//        } catch (SQLException e) {
//            System.out.println("Erreur lors de l'ajout du joueur : " + e.getMessage());
//        }
//    }
//
//    public void editerJoueur(int id, String nom, String prenom, String sexe) {
//        String requete = "UPDATE joueur SET nom = ?, prenom = ?, sexe = ? WHERE id = ?";
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(requete);
//            preparedStatement.setString(1, nom);
//            preparedStatement.setString(2, prenom);
//            preparedStatement.setString(3, sexe);
//            preparedStatement.setInt(4, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Le joueur a été mis à jour dans la base de données.");
//        } catch (SQLException e) {
//            System.out.println("Erreur lors de la mise à jour du joueur : " + e.getMessage());
//        }
//    }
//
//    public void supprimerJoueur(int id) {
//        String requete = "DELETE FROM joueur WHERE id = ?";
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(requete);
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Le joueur a été supprimé de la base de données.");
//        } catch (SQLException e) {
//            System.out.println("Erreur lors de la suppression du joueur : " + e.getMessage());
//        }
//    }
//
//    public Connection getConnection() {
//        return conn;
//    }
//}
//


package ProjetSwing.Swing;

import Tennis.Joueur;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;

public class ConnexionBD {
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
    private String user = "root";
    private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
    private DefaultTableModel tableJoueurs = new DefaultTableModel();
    private String password = "";

    public ConnexionBD() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion à la base de données réussie.");
        } catch (SQLException e) {
            System.out.println("Connexion à la base de données échouée : " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void fermerConnexion() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connexion à la base de données fermée.");
            }
        } catch (SQLException e) {
            System.out.println("Fermeture de la connexion à la base de données échouée : " + e.getMessage());
        }
    }

    public ResultSet listeJoueur() {
        ResultSet resultat = null;
        String requete = "SELECT * FROM joueur";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(requete);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String sexe = rs.getString("sexe");
                Joueur joueurs = new Joueur(id, nom, prenom, sexe);
                listeJoueurs.add(joueurs);
                Object[] row = {id, nom, prenom, sexe};
                tableJoueurs.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des joueurs : " + e.getMessage());
        }
        return resultat;
    }

    public ResultSet rechercherJoueur(String recherche) {
        ResultSet resultat = null;
        String recherche = null;
        String requete = "SELECT * FROM joueur WHERE id = " + recherche;
        try {
            Statement statement = conn.createStatement();
            resultat = statement.executeQuery(requete);
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche du joueur : " + e.getMessage());
        }
        return resultat;
    }



    public void ajouterJoueur(String nom, String prenom, String sexe) {
        String requete = "INSERT INTO joueur (NOM, PRENOM, SEXE) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(requete);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.setString(3, sexe);
            preparedStatement.executeUpdate();
            System.out.println("Le joueur a été ajouté à la base de données.");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du joueur : " + e.getMessage());
        }
    }

    public void editerJoueur(int id, String nom, String prenom, String sexe) {
        String requete = "UPDATE joueur SET nom = ?, prenom = ?, sexe = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(requete);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.setString(3, sexe);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            System.out.println("Le joueur a été mis à jour dans la base de données.");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la mise à jour du joueur : " + e.getMessage());
        }
    }

    public void supprimerJoueur(int id) {
        String requete = "DELETE FROM joueur WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(requete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Le joueur a été supprimé de la base de données.");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du joueur : " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public Object getDernierId() {
        return listeJoueurs.get(listeJoueurs.size() - 1).getId();
    }
}


