package launcher;

import javax.swing.*;

import db.WoordenLezer;
import  domain.*;
import ui.*;

public class Launcher {

    public static void main(String[] args){
        boolean pictionaryBool = false;
        String naam = null;
        while(naam == null || naam.trim().isEmpty()) {
            // gives the optionPane when the input is NULL or empty
            naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
        }
        Speler speler = new Speler(naam); // A new speler is created with the name
        Object[] gameChoise = {"Pictionary", "Hangman"};
        Object keuzeSpel = JOptionPane.showInputDialog(null, "Dag " + speler.getNaam() + ", welk spel wil je spelen?", "keuze spel", JOptionPane.INFORMATION_MESSAGE, null, gameChoise, null);

        if(keuzeSpel == "Hangman"){
            HangManUi hangManUi = new HangManUi(speler, new WoordenLezer("hangman").Lees());
            hangManUi.play();
        }else{
            String tekeningNaam = JOptionPane.showInputDialog("geef de naam van de tekening.");
            Tekening tekening = new Tekening(tekeningNaam);

            JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);
            PictionaryUi player = new PictionaryUi(speler, tekening); //makes a new PictionaryUi

            Object[] shapes = {"Circkel", "Rechthoek", "LijnStuk"};
            Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen? ", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);

                while(pictionaryBool == false){
                    try{
                        player.showMenu();
                        if (keuze == "Circkel") {
                            player.ifCirckel();
                        }else if(keuze == "Rechthoek") {
                            player.ifRechthoek();
                        } else {
                            player.ifLijnStuk();
                        }
                        pictionaryBool = true;
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "U heeft geen geldig punt aangemaakt probeer opnieuw!", speler.getNaam(), 0);
                    }
                }

            }
        }


    }

