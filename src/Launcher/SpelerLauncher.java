package Launcher;

import domain.Speler;
import javax.swing.*;


public class SpelerLauncher {

    String naam = null;

        public SpelerLauncher(){

        }

        public void start(){
                while(naam == null || naam.trim().isEmpty()) {
                    // gives the optionPane when the input is NULL or empty
                    naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
                } //TODO try-catch block when there is expantion
                Speler speler = new Speler(naam); // A new speler is created with the name
                JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);


        }
}
