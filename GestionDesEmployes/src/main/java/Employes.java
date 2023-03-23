import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Employes {
    private JPanel Main;
    private JTextField txtNom;

    private JTextField txtPrenom;
    private JTextField txtSalaire;
    private JTextField txtTelephone;
    private JButton enregistrerbutton;
    private JTable table1;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JButton rechercherButton;
    private JTextField txtid;
    private JScrollPane table_11;

    private JScrollPane table_1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employes");
        frame.setContentPane(new Employes().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


// Connection à la base de donnée
    Connection con;
    PreparedStatement pst;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mns_employes?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris", "root","");
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

    void table_load() {

        try
        {
            pst = con.prepareStatement("select * from employes");
            ResultSet rs = pst.executeQuery();
            //table_1.setModel(DbUtils.resultSetToTableModel(rs));

            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

// Enregistrement / Sauvegarde dans la base de donnée et l'affiche dans la table'
    public Employes() {
        connect();
        table_load();
        enregistrerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String nom, prenom , salaire, telephone, id;
                nom = txtNom.getText();
                prenom = txtPrenom.getText();
                salaire = txtSalaire.getText();
                telephone = txtTelephone.getText();
                //id = txtId.getText();

                try {
                    pst = con.prepareStatement("INSERT INTO Employes (nom, prenom , salaire, telephone) VALUES (?,?,?,?)");
                    pst.setString(1, nom);
                    pst.setString(2, prenom);
                    pst.setString(3, salaire);
                    pst.setString(4, telephone);
                    //pst.setString(4, id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Element ajouté avec succés!!!!!");
                    table_load();
                    txtNom.setText("");
                    txtPrenom.setText("");
                    txtSalaire.setText("");
                    txtTelephone.setText("");
                    //txtId.setText("");
                    txtNom.requestFocus();
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }

            }
        });


        // Rechercher

        rechercherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String id = txtid.getText();

                    pst = con.prepareStatement("select nom, prenom, salaire, telephone  from employes where id=?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()==true)
                    {
                        String nom = rs.getString("nom");
                        String prenom = rs.getString("prenom");
                        String salaire = rs.getString("salaire");
                        String telephone = rs.getString("telephone");

                       txtNom.setText(nom);
                       txtPrenom.setText(prenom);
                        txtSalaire.setText(salaire);
                        txtTelephone.setText(telephone);

                    }
                    else
                    {
                        txtNom.setText("");
                        txtPrenom.setText("");
                        txtSalaire.setText("");
                        txtTelephone.setText("");
                        JOptionPane.showMessageDialog(null,"les informations sont invalides");

                    }
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }
            }

        });

        // Modification
        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    pst = con.prepareStatement("update employes set nom = ?, prenom = ?, salaire = ?,telephone= ? where id = ?");
                    pst.setString(1, txtNom.getText());
                    pst.setString(2, txtPrenom.getText());
                     pst.setString(3, txtSalaire.getText());
                    pst.setString(4, txtTelephone.getText());
                    pst.setString(5, txtid.getText());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Modification Enregistrée!!!!!");
                    table_load();
                    txtNom.setText("");
                    txtPrenom.setText("");
                    txtSalaire.setText("");
                    txtTelephone.setText("");
                    txtNom.requestFocus();

                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }

        });


        // Suppression

        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String id;
                id = txtid.getText();

                try {
                    pst = con.prepareStatement("delete from employes  where id = ?");

                    pst.setString(1, id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Element supprimé avec succès!!!!!");
                    table_load();
                    txtNom.setText("");
                    txtPrenom.setText("");
                    txtSalaire.setText("");
                    txtTelephone.setText("");
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
