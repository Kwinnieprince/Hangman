package Launcher;

import domain.*;

import javax.swing.*;


public class PictionaryUi {
	private Speler speler;
	int xInt;
	int yInt;
	Punt punt;

        public PictionaryUi(Speler speler){

        }

        public void showMenu() {
        	xInt = Integer.parseInt(JOptionPane.showInputDialog("X coordinaat van het punt: "));
            yInt = Integer.parseInt(JOptionPane.showInputDialog("Y coordinaat van het punt: "));
            punt = new Punt(xInt, yInt);

        }

        public void ifCirckel(){
            int radiusInt = Integer.parseInt(JOptionPane.showInputDialog("Radius van de circkel: "));
            Cirkel cirkel = new Cirkel(new Punt(xInt, yInt), radiusInt);
            JOptionPane.showMessageDialog(null, "U heeft een correcte circkel gemaakt: " + cirkel.toString());
        }

        public void  ifRechthoek(){

            int breedteInt = Integer.parseInt(JOptionPane.showInputDialog("Wat is de breedte van de rechthoek?"));
            int hoogteInt = Integer.parseInt(JOptionPane.showInputDialog("Wat is de hoogte van de rechthoek?"));
            Rechthoek rechthoek = new Rechthoek(punt, breedteInt, hoogteInt);
            JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek gemaakt: " + rechthoek.toString());

        }


}
