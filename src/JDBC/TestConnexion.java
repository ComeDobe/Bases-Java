package JDBC;
//
///* Description : Classe de test pour la connexion à une base de données MySQL */
//import java.sql.*;
//
//public class TestConnexion {
//    public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris","root","");
////            Statement statement = conn.createStatement();
////            ResultSet resultSet = statement.executeQuery("select nom, prenom, id  from joueur where id = ?");
//////            while (resultSet.next()) {
////                String nom = resultSet.getString("nom");
////                String prenom = resultSet.getString("prenom");
////                Long id = resultSet.getLong("id");
////                System.out.println("Le joueur représenté par l'id : " +id+ " nom : " + nom + " Prenom : " + prenom);
////            }
//
//            PreparedStatement preparedStatement = conn.prepareStatement("select nom, prenom, id  from joueur where =?");
//            long id = 12L;
//            preparedStatement.setLong(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                String nom = resultSet.getString("nom");
//                String prenom = resultSet.getString("prenom");
//                 id = resultSet.getInt("id");
//                System.out.println("Le joueur représenté par l'id : " +id+ " nom : " + nom + " Prenom : " + prenom);
//            }
//            else {
//                System.out.println(" il n'y pas de joueur :");
//            }
//
//            System.out.println("Success");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnection(conn);
//        }
//    }
//
//    private static void closeConnection(Connection conn) {
//        try {
//            if (conn != null) {
//                conn.close();
//                System.out.println("Connexion fermée");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}



import java.sql.*;

public class TestConnexion {
    public static void main(String[] args) {

        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris", "root", "");
           //Statement statement = conn.createStatement();
//            ResultSet rs=statement.executeQuery("SELECT NOM, PRENOM, ID FROM JOUEUR");
//            while (rs.next()) {
//                String nom = rs.getString("NOM");
//                String PRENOM = rs.getString("PRENOM");
//                Long id = rs.getLong("ID");
//                System.out.println("Le joueur représenté par le numero id " + id + " est " + nom + " " + PRENOM);

           // PreparedStatement preparedstatement = conn.prepareStatement("SELECT NOM,PRENOM, ID FROM JOUEUR WHERE ID=?");
//            PreparedStatement preparedstatement = conn.prepareStatement("UPDATE JOUEUR SET NOM=?, PRENOM=? WHERE ID=?");


//            long id = 12L;
//            preparedstatement.setLong(1, id);
//            ResultSet rs = preparedstatement.executeQuery();
//            if (rs.next()) {
//                String nom = rs.getString("NOM");
//                String prenom = rs.getString("PRENOM");
//                id = rs.getLong("ID");
//                System.out.println("le joueur représenté par le numero| id " + id + " est " + prenom + " " + nom);
//            }
//            else {
//                System.out.println("il n'y a pas de joueur");
//            }

//            conn.setAutoCommit(false);
//            long identifiant = 24;
//            String nom = "Erran";
//            String prenom = "Sarra";
//            preparedstatement.setString(1, nom);
//            preparedstatement.setString(2, prenom);
//            preparedstatement.setLong(3, identifiant);
//            int result = preparedstatement.executeUpdate();
//
//            System.out.println("le nombre d'enregistrement modifié : " + result);
//            conn.commit();
            // • Parcourir toutes les colonnes
//
//           ResultSet rs = conn.createStatement().executeQuery("SELECT NOM, PRENOM, ID FROM Joueur");
////
////            ResultSetMetaData rsmd = rs.getMetaData();
////            int nbCol = rsmd.getColumnCount();
////            for (int i = 1; i <= nbCol; i++) {
////                System.out.println(" " + rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i)+ " " + rsmd.getColumnDisplaySize(i));
////            }

            // On affiche les informations sur la base de données (le nonm de la colonne)
//
//            DatabaseMetaData dbmd = conn.getMetaData();
//            ResultSet rs = dbmd.getTables(conn.getCatalog(), null, "%",  null);
//            while (rs.next()) {
//                System.out.println("##############################################");
//                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
//                    String nomCol = rs.getMetaData().getColumnName(i);
//                    Object valeur = rs.getObject(nomCol);
//                    System.out.println(" " + nomCol + " " + valeur);
//
//                }
//            }

            // Insertion des données dans la base de données
//            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO JOUEUR (NOM,PRENOM,SEXE) VALUES (?,?,?)");
//            conn.setAutoCommit(false);
//            String nom = "Capriati";
//            String prenom = "Jennifer";
//            String sexe = "F";
//
//            nom ="Johanson";
//            prenom ="Thomas";
//            sexe ="H";
//            preparedStatement.setString(1, nom);
//            preparedStatement.setString(2, prenom);
//            preparedStatement.setString(3, sexe);
//            preparedStatement.executeUpdate();

           //conn.commit();

            // Methode BatchUpdate

            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            for (int i = 0; i < 10; i++) {
                statement.addBatch("INSERT INTO JOUEUR values ('NOM" +i+"', 'PRENOM" +i+"', 'SEXE" +i+"')");
            }

            statement.executeBatch();

            System.out.println("success");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)conn.rollback(); {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
