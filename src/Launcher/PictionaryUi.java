package Launcher;

import domain.*;

import javax.swing.*;


public class PictionaryUi {
	private Speler speler;

        public PictionaryUi(Speler speler){

        }

        public void showMenu(){
            String xString = JOptionPane.showInputDialog("X coordinaat van het punt: ");
            String yString = JOptionPane.showInputDialog("Y coordinaat van het punt: ");
            String radiusString = JOptionPane.showInputDialog("Radius van de circkel: ");
            int xInt = Integer.parseInt(xString);
            int yInt = Integer.parseInt(yString);
            int radiusInt = Integer.parseInt(radiusString);
            Punt punt = new Punt(xInt, yInt);
            Cirkel cirkel = new Cirkel(new Punt(xInt, yInt), radiusInt);
            //JOptionPane.showMessageDialog(null, "U heeft een correct punt gemaakt: " + punt.toString());
            JOptionPane.showMessageDialog(null, "U heeft een correcte circkel gemaakt: " + cirkel.toString());

        }


}
