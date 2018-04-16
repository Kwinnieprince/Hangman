package Launcher;

import javax.swing.*;
import  domain.*;

public class Launcher {
    String naam = null;

    public static void main(String[] args){


        String naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
        while(naam == null || naam.trim().isEmpty()) {
            // gives the optionPane when the input is NULL or empty
            naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
        } //TODO try-catch block when there is expantion
        Speler speler = new Speler(naam); // A new speler is created with the name
        JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);

        PictionaryUi player = new PictionaryUi(speler); //makes a new Speler
        try{
            player.showMenu();
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "U heeft geen geldig punt aangemaakt probeer opnieuw!", speler.getNaam(), 0);
        }

    }

}
