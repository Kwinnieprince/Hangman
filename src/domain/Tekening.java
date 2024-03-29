package domain;

import java.awt.Graphics;
import java.util.ArrayList;

public class Tekening implements Drawable {

    private String naam;
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private static final int MAX_X = 399;
    private static final int MAX_Y = 399;
    protected ArrayList<Vorm> vormen;

    public Tekening(String naam){
        setNaam(naam);
        vormen = new ArrayList<Vorm>();
    }

    private void setNaam(String naam){
        if(naam == null || naam.trim().isEmpty()){
            throw new IllegalArgumentException("De naam kan niet leeg zijn");
        }else{
            this.naam = naam;
        }
    }

    public String getNaam(){
        return naam;
    }

    public void voegToe(Vorm vorm){
    	if(vorm.getOmhullende().getMinY() < Tekening.MIN_Y ||
    	   vorm.getOmhullende().getMinX() < Tekening.MIN_X ||
           vorm.getOmhullende().getMaxY() > Tekening.MAX_Y ||
    	   vorm.getOmhullende().getMaxX() > Tekening.MAX_X) throw new IllegalArgumentException("vorm valt buiten tekening.");
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
        if(((Tekening)object).getAantalVormen() != this.getAantalVormen()) return false;
        
        for (Vorm vorm : vormen) {
			if(!((Tekening)object).bevat(vorm)) return false;
		}
        
        return true;
    }

	public void teken(Graphics graphics) {
		for(Vorm v : this.vormen) {
			v.teken(graphics);
		}
		// TODO Auto-generated method stub
		
	}



}
