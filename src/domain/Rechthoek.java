package domain;

public class Rechthoek {
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

    @Override
    public boolean equals(Object object){
        return  false;
    }

    @Override
    public String toString(){
        return null;
    }
}
