package org.emp.gl.lanceur;

import org.emp.gl.entities.Etudiant;
import org.emp.gl.manager.GestionnaireEtudiant;

public class Main {
    public static void main(String[] args) {
        GestionnaireEtudiant g = new GestionnaireEtudiant();
        g.sauvegarder(new Etudiant("SACKO", "Massiré", 24));
        g.sauvegarder(new Etudiant("Doucoure", "Mohammed", 23));
        System.out.println("Tous: " + g.tous());
        System.out.println("Recherche(SACKO): " + g.rechercher("SACKO").orElse(null));
    }
}