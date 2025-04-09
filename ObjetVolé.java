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
public class ObjetVolé {
    private String id;
    private String nom;
    private String description;
    private String proprietaire;
    private String dateDeDeclaration;

    public ObjetVolé(String id, String nom, String description, String proprietaire, String dateDeDeclaration) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.proprietaire = proprietaire;
        this.dateDeDeclaration = dateDeDeclaration;
    }

    // Getters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public String getProprietaire() { return proprietaire; }
    public String getDateDeDeclaration() { return dateDeDeclaration; }
}