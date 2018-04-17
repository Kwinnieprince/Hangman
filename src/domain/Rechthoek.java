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
    	if (linkerBovenhoek == null) throw new DomainException("linkerBovenhoek mag niet 0 zijn");
    	this.linkerBovenhoek = linkerBovenhoek;
    }

    public int getHoogte(){
        return hoogte;
    }

    private void setHoogte(int hoogte){
        if(hoogte < 0){
            throw new DomainException("De hoogte kan niet minder dan 0 zijn");
        }else{
            this.hoogte = hoogte;
        }
    }

    public int getBreedte() {
        return breedte;
    }

    private void setBreedte(int breedte) throws DomainException {
        if(breedte < 0) throw new DomainException("De breedte kan niet negatief zijn");
        this.breedte = breedte;
    }

    @Override
    public boolean equals(Object object){
        if (object == null) return false;
        return this.breedte == ((Rechthoek)object).getBreedte() && this.hoogte == ((Rechthoek)object).getHoogte() && this.linkerBovenhoek == ((Rechthoek)object).getLinkerBovenhoek();
    }

    @Override
    public String toString(){
        return null;
    }
}
