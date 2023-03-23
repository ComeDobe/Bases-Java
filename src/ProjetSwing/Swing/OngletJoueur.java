package ProjetSwing.Swing;
//import Tennis.ConnexionBD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class OngletJoueur extends JFrame implements ActionListener {
    private JTextField tfId, tfNom, tfPrenom, tfRecherche;
    private JRadioButton rbHomme, rbFemme;
    private JButton btnAjouter, btnEditer, btnSupprimer, btnRechercher;
    private JTable tableJoueurs;
    private ConnexionBD connexionBD;
    private DefaultRowSorter<Object, Object> jTable1;
    private  String[] columnNames = {"Id", "Nom", "Prenom", "sexe"};
    private DefaultTableModel tableModel = new DefaultTableModel(null, columnNames);


    public OngletJoueur() {
        super("Gestion des joueurs");

        connexionBD = new ConnexionBD();

        // Créer les composants de l'interface
        tfId = new JTextField(10);
        tfNom = new JTextField(10);
        tfPrenom = new JTextField(10);
        tfRecherche = new JTextField(10);
        rbHomme = new JRadioButton("H", true);
        rbFemme = new JRadioButton("F", false);
        ButtonGroup bgSexe = new ButtonGroup();
        bgSexe.add(rbHomme);
        bgSexe.add(rbFemme);
        btnAjouter = new JButton("Ajouter");
        btnEditer = new JButton("Editer");
        btnSupprimer = new JButton("Supprimer");
        btnRechercher = new JButton("Rechercher");
       String[] entetes = {"ID", "Nom", "Prénom", "Sexe"};
       Object[][] donnees = {};
        //tableModel = new JTable(null, columnNames);

//        tableModel= new DefaultTableModel(null, columnNames);
//        String[] entetes = {"ID", "Nom", "Prénom", "Sexe"};
//        Object[] row = {};
//        tableModel = new JTable(row);


        // Ajouter les composants à l'interface

        JPanel panelFormulaire = new JPanel(new GridLayout(0, 2));
        panelFormulaire.add(new JLabel("ID :"));
        panelFormulaire.add(tfId);
        panelFormulaire.add(new JLabel("Nom :"));
        panelFormulaire.add(tfNom);
        panelFormulaire.add(new JLabel("Prénom :"));
        panelFormulaire.add(tfPrenom);
        panelFormulaire.add(new JLabel("Sexe :"));
        JPanel panelSexe = new JPanel(new GridLayout(1, 0));
        panelSexe.add(rbHomme);
        panelSexe.add(rbFemme);
        panelFormulaire.add(panelSexe);
        JPanel panelBoutons = new JPanel(new FlowLayout());
        panelBoutons.add(btnAjouter);
        panelBoutons.add(btnEditer);
        panelBoutons.add(btnSupprimer);
        panelBoutons.add(btnRechercher);
        JPanel panelHaut = new JPanel(new BorderLayout());
        panelHaut.add(panelFormulaire, BorderLayout.CENTER);
        panelHaut.add(panelBoutons, BorderLayout.SOUTH);
        add(panelHaut, BorderLayout.NORTH);
        add(new JScrollPane(tableModel), BorderLayout.CENTER);
        add(tfRecherche, BorderLayout.SOUTH);

        // Ajouter les écouteurs d'événements
        btnAjouter.addActionListener(this);
        btnEditer.addActionListener(this);
        btnSupprimer.addActionListener(this);
        btnRechercher.addActionListener(this);

        // Configurer l'interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OngletJoueur();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAjouter) {
            ajouterJoueur();
        } else if (e.getSource() == btnEditer) {
            editerJoueur();
        } else if (e.getSource() == btnSupprimer) {
            supprimerJoueur();
        }  else if (e.getSource() == btnRechercher) {
            rechercherJoueur();
        }
    }


    private void rechercherJoueur() {
        String recherche = tfRecherche.getText();
        if (!recherche.isEmpty()) {
            try {
                // Récupérer le joueur correspondant à la recherche
                ResultSet rs = connexionBD.rechercherJoueur(recherche);

                // Mettre à jour la table avec les résultats de la recherche
                DefaultTableModel model = (DefaultTableModel) tableModel.getModel();
                model.setRowCount(0);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nom = rs.getString("nom");
                    String prenom = rs.getString("prenom");
                    String sexe = rs.getString("sexe");
                    Object[] row = {id, nom, prenom, sexe};
                    model.addRow(row);
                }

                // Afficher un message si aucun joueur n'a été trouvé
                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Aucun joueur trouvé pour cette recherche.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la recherche du joueur : " + ex.getMessage());
            }
        }
    }

    private void supprimerJoueur() {
        String idString = tfId.getText();
        if (!idString.isEmpty()) {
            try {
                // Convertir l'ID du joueur en entier
                int id = Integer.parseInt(idString);

                // Demander une confirmation de suppression
                int choix = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de vouloir supprimer le joueur ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
                if (choix == JOptionPane.YES_OPTION) {
                    // Supprimer le joueur de la base de données
                    connexionBD.supprimerJoueur(id);

                    // Actualiser la table et effacer les champs du formulaire
                    actualiserTableJoueur();
                    effacerChamps();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Veuillez saisir un ID valide.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du joueur : " + ex.getMessage());
            }
        }
    }

    private void editerJoueur() {
        String idString = tfId.getText();
        String nom = tfNom.getText();
        String prenom = tfPrenom.getText();
        String sexe = rbHomme.isSelected() ? "H" : "F";
        if (!idString.isEmpty() && !nom.isEmpty() && !prenom.isEmpty()) {
            try {
                // Convertir l'ID du joueur en entier
                int id = Integer.parseInt(idString);

                // Mettre à jour les données du joueur dans la base de données
                connexionBD.editerJoueur(id, nom, prenom, sexe);

                // Actualiser la table et effacer les champs du formulaire
                actualiserTableJoueur();
                effacerChamps();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Veuillez saisir un ID valide.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur lors de l'édition du joueur : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        }
    }

    private void ajouterJoueur() {
        String nom = tfNom.getText();
        String prenom = tfPrenom.getText();
        String sexe = rbHomme.isSelected() ? "H" : "F";
        if (!nom.isEmpty() && !prenom.isEmpty()) {
            try {
// Ajouter le joueur à la base de données
                connexionBD.ajouterJoueur(nom, prenom, sexe);

                // Actualiser la table et effacer les champs du formulaire
                actualiserTableJoueur();
                effacerChamps();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du joueur : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        }
    }




    private void actualiserTableJoueur() throws SQLException {
        ResultSet rs = connexionBD.listeJoueur();
        DefaultTableModel model = (DefaultTableModel) tableModel.addRow();



        // DefaultTableModel model = (DefaultTableModel) JTable.getModel();

        model.setRowCount(0);
        while (rs.next()) {
            int id = rs.getInt("id");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String sexe = rs.getString("sexe");
            Object[] row = {id, nom, prenom, sexe};
            model.addRow(row);
        }
    }

    private void effacerChamps() {
        tfId.setText("");
        tfNom.setText("");
        tfPrenom.setText("");
        rbHomme.setSelected(true);
    }

//    private void rechercherJoueurs() {
//        String recherche = tfRecherche.getText();
//        if (!recherche.isEmpty()) {
//            try {
//                ResultSet rs = connexionBD.rechercherJoueurs(recherche);
//                DefaultTableModel model = (DefaultTableModel) tableJoueurs.getModel();
//                model.setRowCount(0);
//                while (rs.next()) {
//                    int id = rs.getInt("id");
//                    String nom = rs.getString("nom");
//                    String prenom = rs.getString("prenom");
//                    String sexe = rs.getString("sexe");
//                    Object[] row = {id, nom, prenom, sexe};
//                    model.addRow(row);
//                }
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(this, "Erreur lors de la recherche des joueurs : " + ex.getMessage());
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Veuillez saisir une valeur de recherche.");
//        }
//    }

    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
    private String user = "root";
    private String password = "";

    public void ConnexionBD() {
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

    public ResultSet listeJoueurs() {
        return null;
    }

    public ResultSet rechercherJoueurs(String recherche) {
        return null;
    }
}











//
//package ProjetSwing.Swing;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.*;
//
//public class OngletJoueur extends JFrame implements ActionListener {
//    private JTextField tfId, tfNom, tfPrenom, tfRecherche;
//    private JRadioButton rbHomme, rbFemme;
//    private JButton btnAjouter, btnEditer, btnSupprimer, btnRechercher;
//    private JTable tableJoueurs;
//    private ConnexionBD connexionBD;
//    private String[] columnNames = {"Id", "Nom", "Prenom", "sexe"};
//    private DefaultTableModel tableModel;
//
//
//    public OngletJoueur() {
//        super("Gestion des joueurs");
//
//        connexionBD = new ConnexionBD();
//
//        // Créer les composants de l'interface
//        tfId = new JTextField(10);
//        tfNom = new JTextField(10);
//        tfPrenom = new JTextField(10);
//        tfRecherche = new JTextField(10);
//        rbHomme = new JRadioButton("H", true);
//        rbFemme = new JRadioButton("F", false);
//        ButtonGroup bgSexe = new ButtonGroup();
//        bgSexe.add(rbHomme);
//        bgSexe.add(rbFemme);
//        btnAjouter = new JButton("Ajouter");
//        btnEditer = new JButton("Editer");
//        btnSupprimer = new JButton("Supprimer");
//        btnRechercher = new JButton("Rechercher");
//        tableModel = new DefaultTableModel(null, columnNames);
//
//        // Ajouter les composants à l'interface
//
//        JPanel panelFormulaire = new JPanel(new GridLayout(0, 2));
//        panelFormulaire.add(new JLabel("ID :"));
//        panelFormulaire.add(tfId);
//        panelFormulaire.add(new JLabel("Nom :"));
//        panelFormulaire.add(tfNom);
//        panelFormulaire.add(new JLabel("Prénom :"));
//        panelFormulaire.add(tfPrenom);
//        panelFormulaire.add(new JLabel("Sexe :"));
//        JPanel panelSexe = new JPanel(new GridLayout(1, 0));
//        panelSexe.add(rbHomme);
//        panelSexe.add(rbFemme);
//        panelFormulaire.add(panelSexe);
//        JPanel panelBoutons = new JPanel(new FlowLayout());
//        panelBoutons.add(btnAjouter);
//        panelBoutons.add(btnEditer);
//        panelBoutons.add(btnSupprimer);
//        panelBoutons.add(btnRechercher);
//        JPanel panelHaut = new JPanel(new BorderLayout());
//        panelHaut.add(panelFormulaire, BorderLayout.CENTER);
//        panelHaut.add(panelBoutons, BorderLayout.SOUTH);
//        add(panelHaut, BorderLayout.NORTH);
//        tableJoueurs = new JTable(tableModel);
//        add(new JScrollPane(tableJoueurs), BorderLayout.CENTER);
//        add(tfRecherche, BorderLayout.SOUTH);
//
//        // Ajouter les écouteurs d'événements
//        btnAjouter.addActionListener(this);
//        btnEditer.addActionListener(this);
//        btnSupprimer.addActionListener(this);
//        btnRechercher.addActionListener(this);
//
//        // Configurer l'interface
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new OngletJoueur();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btnAjouter) {
//            ajouterJoueur();
//        } else if (e.getSource() == btnEditer) {
//            editerJoueur();
//        } else if (e.getSource() == btnSupprimer) {
//            editerJoueur();
//        } else if (e.getSource() == btnRechercher) {
//            connexionBD.rechercherJoueur();
//        }
//    }
//
//    private void ajouterJoueur() {
//        String id = tfId.getText();
//        String nom = tfNom.getText();
//        String prenom = tfPrenom.getText();
//        String sexe = rbHomme.isSelected() ? "H" : "F";
//
//        if (id.isEmpty() || nom.isEmpty() || prenom.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
//        } else {
//            try {
//                Connection con = connexionBD.getConnection();
//                String sql = "INSERT INTO joueurs (id, nom, prenom, sexe) VALUES (?, ?, ?, ?)";
//                PreparedStatement statement = con.prepareStatement(sql);
//                statement.setString(1, id);
//                statement.setString(2, nom);
//                statement.setString(3, prenom);
//                statement.setString(4, sexe);
//                int rowsInserted = statement.executeUpdate();
//                if (rowsInserted > 0) {
//                    Object[] rowData = {id, nom, prenom, sexe};
//                    tableModel.addRow(rowData);
//                    JOptionPane.showMessageDialog(this, "Le joueur a été ajouté avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
//                    tfId.setText("");
//                    tfNom.setText("");
//                    tfPrenom.setText("");
//                    rbHomme.setSelected(true);
//                }
//                statement.close();
//                con.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du joueur.\n" + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }
//
//    private void editerJoueur() {
//        int selectedRow = tableJoueurs.getSelectedRow();
//        if (selectedRow == -1) {
//            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un joueur dans la liste.", "Erreur", JOptionPane.ERROR_MESSAGE);
//        } else {
//            String id = tfId.getText();
//            String nom = tfNom.getText();
//            String prenom = tfPrenom.getText();
//            String sexe = rbHomme.isSelected() ? "H" : "F";
//            if (id.isEmpty() || nom.isEmpty() || prenom.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
//            } else {
//                try {
//                    Connection con = connexionBD.getConnection();
//                    String sql = "UPDATE joueurs SET nom = ?, prenom = ?, sexe = ? WHERE id = ?";
//                    PreparedStatement statement = con.prepareStatement(sql);
//                    statement.setString(1, nom);
//                    statement.setString(2, prenom);
//                    statement.setString(3, sexe);
//                    statement.setString(4, id);
//                    int rowsUpdated = statement.executeUpdate();
//                    if (rowsUpdated > 0) {
//                        tableModel.setValueAt(nom, selectedRow, 1);
//                        tableModel.setValueAt(prenom, selectedRow, 2);
//                        tableModel.setValueAt(sexe, selectedRow, 3);
//                        JOptionPane.showMessageDialog(this, "Le joueur a été modifié avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
//                        tfId.setText("");
//                        tfNom.setText("");
//                        tfPrenom.setText("");
//                        rbHomme.setSelected(true);
//                    }
//                    statement.close();
//                    con.close();
//                } catch (SQLException e) {
//                    JOptionPane.showMessageDialog(this, "Erreur lors de la modification du joueur.\n" + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
//
//
//
//                }
//            }
//        }
//    }
//
//
//}
