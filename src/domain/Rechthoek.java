package domain;

import java.awt.*;

public class Rechthoek extends Vorm implements Drawable {
    private int breedte;
    private int hoogte;
    private Punt linkerBovenhoek;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte){
        setLinkerBovenhoek(linkerBovenhoek);
        setBreedte(breedte);
        setHoogte(hoogte);
    }

    public Punt getLinkerBovenhoek(){
        return linkerBovenhoek;
    }

    private void setLinkerBovenhoek(Punt linkerBovenhoek){
    	if (linkerBovenhoek == null) throw new DomainException("linkerBovenhoek mag niet 0 zijn");
    	this.linkerBovenhoek = linkerBovenhoek;
    }

    public int getHoogte(){
        return hoogte;
    }

    private void setHoogte(int hoogte)throws DomainException{
    	if(hoogte < 1) throw new DomainException("De hoogte moet minstens 1 zijn.");
    	this.hoogte = hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    private void setBreedte(int breedte)throws DomainException{
        if(breedte < 1) throw new DomainException("De breedte moet minstens 1 zijn.");
        this.breedte = breedte;
    }

    public void teken(Graphics graphics){
    	if(this.isZichtbaar())
    		graphics.drawRect( this.getLinkerBovenhoek().getX(), 
				this.getLinkerBovenhoek().getY(), 
				this.getBreedte(), 
				this.getHoogte());

    }

    @Override
    public boolean equals(Object object){
        if (object == null) return false;
        if(object instanceof Rechthoek) {
        	return (this.breedte == ((Rechthoek)object).getBreedte() && this.hoogte == ((Rechthoek)object).getHoogte() && this.linkerBovenhoek == ((Rechthoek)object).getLinkerBovenhoek());
        }
        else {
        	return false;
        }
    }

    @Override
    public String toString(){
        return "Rechthoek: positie: (" + this.linkerBovenhoek.getX() + ", " + this.linkerBovenhoek.getY() + ") - breedte=" + this.getBreedte() + " - hoogte:" + this.getHoogte() + "\n" + this.getOmhullende().toString();
    }

    @Override
    public Omhullende getOmhullende() {
    	Omhullende omhullende = new Omhullende(this.linkerBovenhoek, this.breedte, this.hoogte);
    	return omhullende;
    }
}
