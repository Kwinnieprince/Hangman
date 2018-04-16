package Launcher;

import domain.Speler;
import javax.swing.*;


public class PictionaryUi {
	private Speler speler;
    String naam = null;

        public PictionaryUi(Speler speler){
        	
        }

        public void showMenu(){
                while(naam == null || naam.trim().isEmpty()) {
                    // gives the optionPane when the input is NULL or empty
                    naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
                } //TODO try-catch block when there is expantion
                Speler speler = new Speler(naam); // A new speler is created with the name
                JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);


        }
}
