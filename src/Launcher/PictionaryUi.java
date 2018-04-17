package Launcher;

import domain.*;

import javax.swing.*;


public class PictionaryUi {
	private Speler speler;

        public PictionaryUi(Speler speler){

        }

        public void showMenu() {
        	int xInt = Integer.parseInt(JOptionPane.showInputDialog("X coordinaat van het punt: "));
            int yInt = Integer.parseInt(JOptionPane.showInputDialog("Y coordinaat van het punt: "));
            int radiusInt = Integer.parseInt(JOptionPane.showInputDialog("Radius van de circkel: "));
            Punt punt = new Punt(xInt, yInt);
            Cirkel cirkel = new Cirkel(new Punt(xInt, yInt), radiusInt);
            JOptionPane.showMessageDialog(null, "U heeft een correcte circkel gemaakt: " + cirkel.toString());
        }


}
