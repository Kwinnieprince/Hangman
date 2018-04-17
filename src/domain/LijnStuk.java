package domain;

public class LijnStuk extends Vorm {
	private Punt startPunt;
	private Punt eindPunt;
	
	public LijnStuk(Punt startPunt, Punt eindPunt) {
		this.setStartEnEindPunt(startPunt, eindPunt);
	}
	
	public void setStartEnEindPunt(Punt startPunt, Punt eindPunt) {
		if (startPunt == null || eindPunt == null) throw new DomainException("Begin en eindpunt mogen niet null zijn.");
		if (startPunt.equals(eindPunt)) throw new DomainException("Begin en eindpunt mogen niet hetzelfde zijn.");
		this.startPunt = startPunt;
		this.eindPunt = eindPunt;
	}
	
	public Punt getStartPunt() {
		return this.startPunt;
	}
	
	public Punt getEindPunt() {
		return this.eindPunt;
	}
	
	public Omhullende getOmhullende() {
		int minX = Math.min(this.startPunt.getX(), this.eindPunt.getX());
		int minY = Math.min(this.startPunt.getY(), this.eindPunt.getY());
		Punt positieLinksBoven = new Punt(minX, minY);
		int breedte = Math.max(this.startPunt.getX(), this.eindPunt.getX()) - minX;
		int hoogte = Math.max(this.startPunt.getY(), this.eindPunt.getY()) - minY;
		Omhullende omhullende = new Omhullende(positieLinksBoven, breedte, hoogte);
		return omhullende;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o instanceof LijnStuk) {
			if (this.getEindPunt().equals(((LijnStuk)o).getEindPunt())) return true;
			return false;
		} else return false;
	}
	
	@Override
	public String toString() {
		return "Lijn: startpunt: " + this.getStartPunt().toString() + " - eindpunt: " + this.getEindPunt().toString() + "\n" + this.getOmhullende().toString();
	}
}
