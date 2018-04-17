package domain;

import java.util.ArrayList;

public class Tekening extends Vorm{

    private String naam;
    private int MIN_X;
    private int MIN_Y;
    private int MAX_X;
    private int MAX_Y;
    private ArrayList<Vorm> vormen;

    public Tekening(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return naam;
    }

    public void voegToe(Vorm vorm){
        vormen.add(vorm);
    }

    public Vorm getVorm(int index){
        return vormen.get(index);
    }

    public int getAantalVormen(){
        int i = 0;
        for (Vorm vorm: vormen) {
            i++;
        }
        return i;
    }

    public void verwijder(Vorm vorm){
        vormen.remove(vorm);
    }

    public boolean bevat(Vorm vorm){
       return vormen.contains(vorm);
    }

    @Override
    public String toString(){
        return "tekening met naam " + naam + " bestaat uit " + getAantalVormen() ": ";
    }

    @Override
    public boolean equals(Object object){
        return true;
    }



}
