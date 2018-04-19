package ui;

import domain.DomainException;
import domain.HintWoord;
import domain.Speler;

import javax.swing.*;

import domain.WoordenLijst;

public class HangManUi {

    private Speler speler;
    private WoordenLijst woordenLijst; //List of words players has to guess one word from

    public HangManUi(Speler speler, WoordenLijst woordenLijst){
        this.speler = speler;
        if (woordenLijst == null) throw new UiException("Geen geldige woordenLijst");
        this.woordenLijst = woordenLijst;
    }

    public void play(){
    	HintWoord woord = new HintWoord(this.woordenLijst.getRandomWoord());
    	String juistOfFout = "";
    	String letter = null;
    	while(!woord.isGeraden()) {
        	try {
        		letter = JOptionPane.showInputDialog(null, juistOfFout + "Rarara, welk woord zoeken we \n " + woord + " \n Geef een letter:", "Hangman - " + speler.getNaam(), 1 );
                if (letter == null || letter.trim().isEmpty() || letter.length() > 1) throw new UiException("Geen geldige letter");
                else {
                		if (woord.raad(letter.charAt(0))) {
                			juistOfFout = "Super, doe zo voort!\n \n";
                		} else {
                			juistOfFout = "Helaas, volgende keer beter!\n \n";
                		}
                	}
        	} catch (UiException e) {
        		juistOfFout = e.getMessage() + "\n \n";
        	} catch (DomainException e) {
        		juistOfFout = e.getMessage() + "\n \n";
        	}
            }
    	Object[] keuzes = {"Ja", "Nee"};
    	Object keuze = JOptionPane.showInputDialog(null, "Goedzo! Je hebt het woord geraden.\n \nWil je nog eens spelen?\n" + woord, "input", JOptionPane.INFORMATION_MESSAGE, null, keuzes, null);
    	if (keuze == "Ja") this.play();
    }

}
