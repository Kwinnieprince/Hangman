package Launcher;

import domain.Speler;
import javax.swing.*;


public class SpelerLauncher {

    String naam = null;

        public SpelerLauncher(){

        }

        public void start(){

                String naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
                Speler speler = new Speler(naam);
                JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);


        }
}
