package domain;

import com.sun.java.browser.dom.DOMAccessException;

import java.util.ArrayList;

public class Tekening {

    private String naam;
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private static final int MAX_X = 399;
    private static final int MAX_Y = 399;
    private ArrayList<Vorm> vormen;

    public Tekening(String naam){
        setNaam(naam);
    }

    private void setNaam(String naam){
        if(naam == null || naam.trim().isEmpty()){
            throw new DomainException("De naam kan niet leeg zijn");
        }else{
            this.naam = naam;
        }
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
        return "tekening met naam " + naam + " bestaat uit " + getAantalVormen() + ": ";
    }

    @Override
    public boolean equals(Object object){
        if(object == null)return false;
        
        if(this.naam != ((Tekening)object).getNaam()) return false;
        
        for (Vorm vorm : vormen) {
			if(!((Tekening)object).bevat(vorm)) return false;
		}
        
        return true;
    }



}
