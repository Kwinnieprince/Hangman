package Launcher;

import javax.swing.*;
import  domain.*;

public class Launcher {

    public static void main(String[] args){
        boolean pictionaryBool = false;

        String naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
        while(naam == null || naam.trim().isEmpty()) {
            // gives the optionPane when the input is NULL or empty
            naam = JOptionPane.showInputDialog("Welkom! " + "\n" + "Hoe heet je?");
        } //TODO try-catch block when there is expansion
        Speler speler = new Speler(naam); // A new speler is created with the name
        JOptionPane.showMessageDialog(null, speler.getNaam() + " heeft als score: " + speler.getScore(), speler.getNaam(), 1);

        PictionaryUi player = new PictionaryUi(speler); //makes a new PictionaryUi
        while(pictionaryBool == false){
            try{
                player.showMenu();
                pictionaryBool = true;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "U heeft geen geldig punt aangemaakt probeer opnieuw!", speler.getNaam(), 0);
            }
        }


    }

}
