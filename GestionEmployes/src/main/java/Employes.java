import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Employes {


    private JPanel Main;
    private JTextField txtNom;
    private JTextField txtSalaire;
    private JTextField txtTelephone;
    private JButton enregistrerButton;
    private JTable table1;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JButton rechercherButton;
    private JTextField txtId;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employes");
        frame.setContentPane(new Employes().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Connection con;
    PreparedStatement pst;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/rbcompagny?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris", "root","");
            System.out.println("Successs");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }

    }

    public Employes() {
       // Main = new JPanel();
        connect();
        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String nom, salaire, telephone, id;
                nom = txtNom.getText();
                salaire = txtSalaire.getText();
                telephone = txtTelephone.getText();
               //id = txtId.getText();

                try {
                    pst = con.prepareStatement("INSERT INTO Employes (nom, salaire, telephone) VALUES (?,?,?)");
                    pst.setString(1, nom);
                    pst.setString(2, salaire);
                    pst.setString(3, telephone);
                    //pst.setString(4, id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Enregistrer avec succés!!!!!");
                    //table_load();
                    txtNom.setText("");
                    txtSalaire.setText("");
                    txtTelephone.setText("");
                    txtId.setText("");
                    txtNom.requestFocus();
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }

        });
    }
}
