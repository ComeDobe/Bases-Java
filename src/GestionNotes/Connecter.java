package GestionNotes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
    Connection con;
    public Connecter(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("chargement est reussie");
        }
        catch(ClassNotFoundException e) {
            System.out.println(e);}

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");}
        catch(SQLException e){System.out.println(e);}

    }
    Connection ObtenirConnextion(){return con;}


    public Connection obtenirconnexion() {
        return con;
    }
}