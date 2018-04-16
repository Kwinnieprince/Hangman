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

    private void setHoogte(int hoogte){
        if(hoogte < 0){
            throw new IllegalArgumentException("De hoogte kan niet minder dan 0 zijn");
        }else{
            this.hoogte = hoogte;
        }
    }

    public int getBreedte() {
        return breedte;
    }

    private void setBreedte(int breedte){
        if(breedte < 0){
            throw new IllegalArgumentException("De breedte kan niet negatief zijn");
        }else{
            this.breedte = breedte;
        }
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
