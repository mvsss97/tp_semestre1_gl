package org.emp.gl.ui;

import javax.swing.*;
import java.awt.*;
import org.emp.gl.manager.GestionnaireEtudiant;
import org.emp.gl.entities.Etudiant;

public class SwingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GestionnaireEtudiant g = new GestionnaireEtudiant();
            g.sauvegarder(new Etudiant("SACKO","Massiré",24));
            g.sauvegarder(new Etudiant("Doucoure","Mohammed",23));

            JFrame f = new JFrame("Etudiants");
            DefaultListModel<String> model = new DefaultListModel<>();
            for (Etudiant e : g.tous()) model.addElement(e.toString());
            JList<String> list = new JList<>(model);

            f.setLayout(new BorderLayout());
            f.add(new JScrollPane(list), BorderLayout.CENTER);
            f.setSize(360,240);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setVisible(true);
        });
    }
}