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
		return "Lijn: startpunt: " + this.getStartPunt().toString() + " - eindpunt: " + this.getEindPunt().toString();
	}
}
