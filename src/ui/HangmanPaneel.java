package ui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import domain.HangMan;

public class HangmanPaneel extends JPanel {

	private static final long serialVersionUID = 1L;	
	
	private JTextField letter;	
	private JLabel woord;
	
	private TekenVenster tekenVenster;
	private HangMan spel;
	
	public HangmanPaneel(HangMan spel){
		super();
		setSpel(spel);
		init();
	}

	private void init(){
		letter = new JTextField("",5);
		woord = new JLabel("");
		
		this.setLayout(new BorderLayout());
		this.add(letter, BorderLayout.EAST);
		this.add(woord, BorderLayout.CENTER);
		
		letter.addKeyListener(new RaadLuisteraar());
	}
	
	private void reset() {
		woord.setText(getSpel().getHint());
		spel.getTekening().reset();
		getTekenVenster().teken();
	}
	
	public class RaadLuisteraar implements KeyListener {

		public void keyPressed(KeyEvent arg0) {
			if(arg0.getKeyCode()== KeyEvent.VK_ENTER){
				String input = letter.getText();
				char guess = '\u0000';
				if(input.length() > 0){
					guess = input.charAt(0);
				}
				
				spel.raad(guess);
				

				woord.setText(getSpel().getHint());
				letter.setText("");
				getTekenVenster().teken();
				
				if(spel.isGewonnen()) {
					String message = "Goedzo! Je hebt het woord geraden.\n \nWil je nog eens spelen?\n";
					replay(message);
				}
				else if (spel.isGameOver()) {
					String message = "Helaas, je hebt het woord niet kunnen raden.\n \nWil je nog eens spelen?\n";
					replay(message);
				}
				
				
				//TODO
				//toon boodschap als gewonnen of verloren en vraag of speler opnieuw wilt spelen
				//als de speler opnieuw wilt spelen: herzet het spel en het paneel
				//anders stop (System.exit(0))
			}
		}
		
		private void replay(String message) {
			Object[] keuzes = {"Ja", "Nee"};
	    	Object keuze = JOptionPane.showInputDialog(null, message, "input", JOptionPane.INFORMATION_MESSAGE, null, keuzes, null);
	    	if (keuze == "Nee") System.exit(0);
	    	if (keuze == "Ja") {
	    		spel.nieuwWoord();
	    		reset();
	    	}
		}

//		@Override
		public void keyReleased(KeyEvent arg0) {/* Niet nodig*/}
//		@Override
		public void keyTyped(KeyEvent arg0) {/* Niet nodig*/}
	}
	
	private void setSpel(HangMan spel){
		this.spel = spel;
	}

	private HangMan getSpel() {
		return spel;
	}
	

	private TekenVenster getTekenVenster() {
		return tekenVenster;
	}

	 public void setTekenVenster(TekenVenster tekenVenster) {
		this.tekenVenster = tekenVenster;

		reset();
	}
}