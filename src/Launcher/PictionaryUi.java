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
            int xInt = Integer.parseInt(xString);
            int yInt = Integer.parseInt(yString);
            Punt punt = new Punt(xInt, yInt);
            JOptionPane.showMessageDialog(null, "U heeft een correct punt gemaakt: " + punt.toString());
        }


}
