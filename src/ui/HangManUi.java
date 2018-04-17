package ui;

import domain.Speler;

import javax.swing.*;

public class HangManUi {

    private Speler speler;

    public HangManUi(Speler speler){
        this.speler = speler;
    }

    public void guess(){
        String givenLetter = JOptionPane.showInputDialog(null, "Rarara, welk woord zoeken we \n " + " TODO" + " \n Geef een letter:", "Hangman - " + speler.getNaam(), 1 );

        //TODO implement wrong and right
    }

}
