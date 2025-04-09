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
import java.util.ArrayList;
import java.util.List;

public class BaseDeDonnées {
    private List<ObjetVolé> objetsVolés;

    public BaseDeDonnées() {
        objetsVolés = new ArrayList<>();
        // Ajout d'objets volés pour la démonstration
        objetsVolés.add(new ObjetVolé("1", "iPhone 12", "iPhone noir", "Alice", "2023-01-01"));
        objetsVolés.add(new ObjetVolé("2", "MacBook Pro", "MacBook gris", "Bob", "2023-02-01"));
    }

    public ObjetVolé rechercherObjet(String nom) {
        for (ObjetVolé objet : objetsVolés) {
            if (objet.getNom().equalsIgnoreCase(nom)) {
                return objet;
            }
        }
        return null;
    }
}