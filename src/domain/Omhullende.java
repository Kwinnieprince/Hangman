package domain;

public class Omhullende {
	private Punt positieLinksBoven;
	private int breedte;
	private int hoogte;
	
	public Omhullende(Punt positieLinksBoven, int breedte, int hoogte) {
		setPunt(positieLinksBoven);
		setBreedte(breedte);
		setHoogte(hoogte);
	}
	
	private void setPunt(Punt punt)throws DomainException {
		if(punt == null)throw new DomainException("Punt mag niet null zijn.");
		this.positieLinksBoven = punt;
	}
	
	private void setBreedte(int breedte)throws DomainException {
		if(breedte < 0) throw new DomainException("Breedte mag niet kleiner als 0 zijn.");
		this.breedte = breedte;
	}
	
	private void setHoogte(int hoogte)throws DomainException {
		if(hoogte < 0 ) throw new DomainException("Hoogte mag niet kleiner als 0 zijn.");
		this.hoogte = hoogte;
	}
	
	@Override
	public boolean equals(Object object) {
		/*
		if(object == null)return false;
		Omhullende omhullende = (Omhullende)object;
		return this.positieLinksBoven == omhullende.getLinkerBovenhoek() && this.breedte == omhullende.getBreedte() && this.hoogte == omhullende.getHoogte();
	*/
		boolean b = false;
		if (object == null) return b;
		if (object instanceof Omhullende) {
			b = true;
			if (!this.getLinkerBovenhoek().equals(((Omhullende)object).getLinkerBovenhoek())) b = false;
			if (this.getBreedte() != (((Omhullende)object).getBreedte())) b = false;
			if (this.getHoogte() != ((Omhullende)object).getHoogte()) b = false;
		}
		return b;
	}
	
	@Override
	public String toString() {
		return "Omhullende: " + this.getLinkerBovenhoek() + " - " + breedte + " - " + hoogte;
	}
	
	public Punt getLinkerBovenhoek() {
		return this.positieLinksBoven;
	}
	
	public int getHoogte() {
		return this.hoogte;
	}
	
	public int getBreedte() {
		return this.breedte;
	}
	
	public int getMinimumX() {
		return positieLinksBoven.getX();
	}
	
	public int getMaximumX() {
		return positieLinksBoven.getX() + this.breedte;
	}
	
	public int getMinimumY() {
		return positieLinksBoven.getY();
	}
	
	public int getMaximumY() {
		return positieLinksBoven.getY() + hoogte;
	}
}
