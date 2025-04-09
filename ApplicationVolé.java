/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monprojetobjetvole;

/**
 *
 * @author ORNELLA
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationVolé {
    private JFrame frame;
    private JTextField textFieldNom;
    private JTextArea textAreaResultat;
    private BaseDeDonnées baseDeDonnées;

    public ApplicationVolé() {
        baseDeDonnées = new BaseDeDonnées();
        frame = new JFrame("Recherche d'Objet Volé");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelNom = new JLabel("Nom de l'objet:");
        labelNom.setBounds(10, 10, 150, 25);
        frame.add(labelNom);

        textFieldNom = new JTextField();
        textFieldNom.setBounds(150, 10, 200, 25);
        frame.add(textFieldNom);

        JButton buttonRechercher = new JButton("Rechercher");
        buttonRechercher.setBounds(10, 50, 150, 25);
        frame.add(buttonRechercher);

        textAreaResultat = new JTextArea();
        textAreaResultat.setBounds(10, 90, 360, 150);
        textAreaResultat.setEditable(false);
        frame.add(textAreaResultat);

        buttonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textFieldNom.getText();
                ObjetVolé objet = baseDeDonnées.rechercherObjet(nom);
                if (objet != null) {
                    textAreaResultat.setText("Objet trouvé:\n" +
                            "Nom: " + objet.getNom() + "\n" +
                            "Description: " + objet.getDescription() + "\n" +
                            "Propriétaire: " + objet.getProprietaire() + "\n" +
                            "Date de déclaration: " + objet.getDateDeDeclaration());
                } else {
                    textAreaResultat.setText("Objet non trouvé.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ApplicationVolé();
    }
}
