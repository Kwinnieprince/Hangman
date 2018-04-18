package ui;

import domain.*;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;


public class PictionaryUi {
	private Speler speler;
	int xInt;
	int yInt;
	Punt punt;
	Tekening tekening;

        public PictionaryUi(Speler speler, Tekening tekening){
        	this.setSpeler(speler);
        	this.setTekening(tekening);
        }

        private void setSpeler(Speler speler) throws UiException {
        	if (speler == null) {
        		throw new UiException("Speler kan niet null zijn.");
        	}
			this.speler = speler;
		}

		private void setTekening(Tekening tekening) throws UiException {
			if (tekening == null) {
				throw new UiException("Tekening kan niet null zijn.");
			}
			this.tekening = tekening;
		}

		public void showMenu() {
        	xInt = Integer.parseInt(JOptionPane.showInputDialog("X coordinaat van het punt: "));
            yInt = Integer.parseInt(JOptionPane.showInputDialog("Y coordinaat van het punt: "));
            punt = new Punt(xInt, yInt);

        }

        public void ifCirckel(){
            int radiusInt = Integer.parseInt(JOptionPane.showInputDialog("Radius van de circkel: "));
            Cirkel cirkel = new Cirkel(new Punt(xInt, yInt), radiusInt);
            //JOptionPane.showMessageDialog(null, "U heeft een correcte circkel gemaakt: " + cirkel.toString());
            tekening.voegToe(cirkel);
            this.drawTekening(this.tekening);
        }

        public void  ifRechthoek(){

            int breedteInt = Integer.parseInt(JOptionPane.showInputDialog("Wat is de breedte van de rechthoek?"));
            int hoogteInt = Integer.parseInt(JOptionPane.showInputDialog("Wat is de hoogte van de rechthoek?"));
            Rechthoek rechthoek = new Rechthoek(punt, breedteInt, hoogteInt);
            //JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek gemaakt: " + rechthoek.toString());
            tekening.voegToe(rechthoek);
            this.drawTekening(this.tekening);

        }
        
        public void ifLijnStuk() {
        	boolean aangemaakt = false;
        	LijnStuk lijnStuk = null;
        	while (!aangemaakt) {
        		try {
	        	int xInt2 = Integer.parseInt(JOptionPane.showInputDialog("X coordinaat van het eindpunt van het LijnStuk: "));
	            int yInt2 = Integer.parseInt(JOptionPane.showInputDialog("Y coordinaat van het eindpunt van het LijnStuk: "));
	            Punt punt2 = new Punt(xInt2, yInt2);
	            lijnStuk = new LijnStuk(punt, punt2);
	            aangemaakt = true;
        		} catch (DomainException e) {
        			JOptionPane.showMessageDialog(null, e + "\nProbeer opnieuw");
        		}
        	}
            //JOptionPane.showMessageDialog(null, "U heeft een correct LijnStuk gemaakt: " + lijnStuk.toString());
        	tekening.voegToe(lijnStuk);
            this.drawTekening(this.tekening);
        }
        
        private void drawTekening(Tekening tekening) {
        	GameHoofdScherm view = new GameHoofdScherm(speler.getNaam(), tekening);
        	view.setVisible(true);
        	view.teken();
        }
        
}
