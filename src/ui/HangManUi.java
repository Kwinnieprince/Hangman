package ui;


import domain.HangMan;
import domain.Speler;

import javax.swing.*;

import domain.WoordenLijst;

public class HangManUi {

    private Speler speler;
    private WoordenLijst woordenLijst; //List of words players has to guess one word from
    private HangMan hangmanSpel;
    private HangmanPaneel hangmanPaneel;
    private HangManHoofdScherm hangmanHoofdscherm;
    
    
    public HangManUi(Speler speler, WoordenLijst woordenLijst){
        this.speler = speler;
        if (woordenLijst == null) throw new UiException("Geen geldige woordenLijst");
        this.woordenLijst = woordenLijst;
    }

    public void play(){
    	hangmanSpel = new HangMan(speler, woordenLijst);
    	hangmanPaneel = new HangmanPaneel(hangmanSpel);
    	hangmanHoofdscherm = new HangManHoofdScherm(hangmanSpel, hangmanPaneel);
    	hangmanHoofdscherm.start();
    }

}
