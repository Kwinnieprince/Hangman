package domain;

public class HangMan {
	private Speler speler;
	private WoordenLijst woordenlijst;
	
	public HangMan(Speler speler, WoordenLijst woordenlijst) {
		setSpeler(speler);
		setWoordenlijst(woordenlijst);
		
	}
	
	public String getHint() {

	}
	
	public Speler getSpeler() {
		return speler;
	}
	
	public TekeningHangMan getTekening() {
		
	}
	
	public void raadLetter(char letter) {
		
	}
	
	public boolean isGameOver() {
		
	}
	
	public boolean isGewonnen() {
		
	}

	public void setSpeler(Speler speler) {
		if (speler != null) {
			this.speler = speler;
		} else {
			throw new DomainException("speler mag niet null zijn.");
		}
	}
	
	public void setWoordenlijst(WoordenLijst woordenlijst) {
		if (woordenlijst != null) {
			this.woordenlijst = woordenlijst;
		} else {
			throw new DomainException("woordelijst mag niet null zijn.");
		}
	}
	
}
