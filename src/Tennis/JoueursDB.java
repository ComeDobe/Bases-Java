//package Tennis;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JoueursDB {
//
//    private Connection connection;
//    private Statement statement;
//    private ResultSet resultSet;
//
//    public JoueursDB() {
//        connection = null;
//        statement = null;
//        resultSet = null;
//    }
//
//    public void connect() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/tennis", "root", "");
//            statement = connection.createStatement();
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//    public void disconnect() {
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//
//            if (statement != null) {
//                statement.close();
//            }
//
//            if (connection != null) {
//                connection.close();
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//    public boolean ajouterJoueur(Joueur joueur) {
//        try {
//            String query = "INSERT INTO joueurs (nom, prenom, sexe) VALUES (?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, joueur.getNom());
//            preparedStatement.setString(2, joueur.getPrenom());
//            preparedStatement.setString(3, joueur.getSexe().toString());
//            preparedStatement.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public boolean modifierJoueur(Joueur joueur) {
//        try {
//            String query = "UPDATE joueurs SET nom = ?, prenom = ?, sexe = ? WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, joueur.getNom());
//            preparedStatement.setString(2, joueur.getPrenom());
//            preparedStatement.setString(3, joueur.getSexe().toString());
//            preparedStatement.setInt(4, joueur.getId());
//            preparedStatement.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public boolean supprimerJoueur(int id) {
//        try {
//            String query = "DELETE FROM joueurs WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public <Sexe> List<Joueur> rechercherJoueurs(String texteRecherche, Sexe sexe) {
//        List<Joueur> joueurs = new ArrayList<Joueur>();
//        try {
//            String query = "SELECT * FROM joueurs WHERE (nom LIKE ? OR prenom LIKE ?)";
//            if (sexe != null) {
//                query += " AND sexe = ?";
//            }
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "%" + texteRecherche + "%");
//            preparedStatement.setString(2, "%" + texteRecherche + "%");
//            if (sexe != null) {
//                preparedStatement.setString(3, sexe.toString());
//            }
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String nom = resultSet.getString("nom");
//                String prenom = resultSet.getString("prenom");
//                Sexe s = null;
//               // s = Sexe.ValueOf(resultSet.getString("sexe"));
//                Joueur joueur = new Joueur(id, nom, prenom, s);
//                joueurs.add(joueur);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        return joueurs;
//    }
//}
//
//
//
