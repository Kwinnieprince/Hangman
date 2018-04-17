package ui;

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

    public void guess(){
        String givenLetter = JOptionPane.showInputDialog(null, "Rarara, welk woord zoeken we \n " + " TODO" + " \n Geef een letter:", "Hangman - " + speler.getNaam(), 1 );

        //TODO implement wrong and right
    }

}
