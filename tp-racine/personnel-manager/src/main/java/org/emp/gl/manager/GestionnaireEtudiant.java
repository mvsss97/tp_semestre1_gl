package org.emp.gl.manager;

import org.emp.gl.entities.Etudiant;
import java.util.*;

public class GestionnaireEtudiant {
    private final List<Etudiant> etudiants = new ArrayList<>();
    public void sauvegarder(Etudiant e) { etudiants.add(e); }
    public Optional<Etudiant> rechercher(String nom) {
        return etudiants.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).findFirst();
    }
    public List<Etudiant> tous() { return Collections.unmodifiableList(etudiants); }
}