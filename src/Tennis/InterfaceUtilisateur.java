package Tennis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceUtilisateur extends JFrame implements ActionListener {
    private JTabbedPane onglets;
    private JPanel ongletJoueur;
    private JPanel ongletTournois;
    private JPanel ongletMatchs;
    private JPanel ongletEpreuves;
    private JButton ajouterJoueurButton;
    private JButton editerJoueurButton;
    private JButton supprimerJoueurButton;
    private JTextField rechercheJoueurField;
    private JRadioButton hommesRadio;
    private JRadioButton femmesRadio;
    private JButton ajouterTournoiButton;
    private JButton editerTournoiButton;
    private JButton supprimerTournoiButton;
    private JTextField rechercheTournoiField;
    private JButton rechercherMatchButton;
    private JTextField rechercheMatchField;
    private JRadioButton vainqueursRadio;
    private JRadioButton finalistesRadio;
    private JButton rechercherEpreuveButton;
    private JTextField anneeEpreuveField;
    private JTextField typeEpreuveField;
    private JTextArea resultatEpreuveArea;

    public InterfaceUtilisateur() {
        // Initialisation de la fenêtre
        setTitle("Application de tennis");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des onglets
        onglets = new JTabbedPane();

        // Initialisation de l'onglet joueur
        ongletJoueur = new JPanel();
        ajouterJoueurButton = new JButton("Ajouter");
        editerJoueurButton = new JButton("Editer");
        supprimerJoueurButton = new JButton("Supprimer");
        rechercheJoueurField = new JTextField(20);
        hommesRadio = new JRadioButton("Hommes");
        femmesRadio = new JRadioButton("Femmes");
        ButtonGroup sexeGroup = new ButtonGroup();
        sexeGroup.add(hommesRadio);
        sexeGroup.add(femmesRadio);
        JPanel optionsPanel = new JPanel();
        optionsPanel.add(rechercheJoueurField);
        optionsPanel.add(hommesRadio);
        optionsPanel.add(femmesRadio);
        JPanel boutonsPanel = new JPanel();
        boutonsPanel.add(ajouterJoueurButton);
        boutonsPanel.add(editerJoueurButton);
        boutonsPanel.add(supprimerJoueurButton);
        ongletJoueur.setLayout(new BorderLayout());
        ongletJoueur.add(optionsPanel, BorderLayout.NORTH);
        ongletJoueur.add(boutonsPanel, BorderLayout.SOUTH);

        // Initialisation de l'onglet tournois
        ongletTournois = new JPanel();
        ajouterTournoiButton = new JButton("Ajouter");
        editerTournoiButton = new JButton("Editer");
        supprimerTournoiButton = new JButton("Supprimer");
        rechercheTournoiField = new JTextField(20);
        JPanel optionsTournoiPanel = new JPanel();
        optionsTournoiPanel.add(rechercheTournoiField);
        JPanel boutonsTournoiPanel = new JPanel();
        boutonsTournoiPanel.add(ajouterTournoiButton);
        boutonsTournoiPanel.add(editerTournoiButton);
        boutonsTournoiPanel.add(supprimerTournoiButton);
        ongletTournois.setLayout(new BorderLayout());
        ongletTournois.add(optionsTournoiPanel, BorderLayout.NORTH);
        ongletTournois.add(boutonsTournoiPanel, BorderLayout.SOUTH);

    }

    public <BaseDeDonnees> InterfaceUtilisateur(BaseDeDonnees baseDeDonnees) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void afficher() {
    }
}
