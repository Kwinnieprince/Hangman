package domain;

import java.util.ArrayList;

public class Tekening{

    private String naam;
    private int MIN_X;
    private int MIN_Y;
    private int MAX_X;
    private int MAX_Y;
    private ArrayList<Vorm> vormen;

    public Tekening(String naam){

    }

    public String getNaam(){
        return naam;
    }

    public void voegToe(Vorm vorm){

    }

    public Vorm getVorm(int index){
        return null;
    }

    public int getAantalVormen(){
        return 1;
    }

    public void verwijder(Vorm vorm){

    }

    public boolean bevat(Vorm vorm){
        return  false;
    }

    @Override
    public String toString(){
        return null;
    }

    @Override
    public boolean equals(Object object){
        return true;
    }



}
