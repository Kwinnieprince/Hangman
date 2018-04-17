package domain;

public class Cirkel extends Vorm {
    private int radius;
    private Punt middelpunt;

    public Cirkel(Punt middelpunt, int radius){
        this.middelpunt = middelpunt;
        setRadius(radius);
    }

    public void setMiddelpunt(Punt middelpunt){

    }

    public Punt getMiddelpunt(){
        return  middelpunt;
    }

    private void setRadius(int radius){
        if (radius < 0) throw new IllegalArgumentException("de radius kan niet kleiner zijn dan 0");
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public Omhullende getOmhullende() {
    	Punt positieLinksBoven = new Punt(this.getMiddelpunt().getX()-this.getRadius(), this.getMiddelpunt().getY()-this.getRadius());
    	int breedte = this.radius*2;
    	int hoogte = this.radius*2;
    	Omhullende omhullende = new Omhullende(positieLinksBoven, breedte, hoogte); 
    	return omhullende;
    }
    
    @Override
    public boolean equals(Object object){
      if(object == null) return false;
      return this.radius == ((Cirkel)object).getRadius() && this.middelpunt == ((Cirkel) object).getMiddelpunt();
    }

    @Override
    public String toString(){
        return "Cirkel: middelpunt: (" + getMiddelpunt().getX() + ", " + getMiddelpunt().getY() + ") - straal: " + getRadius() + "\n" + this.getOmhullende().toString();
    }
}
