package domain;

public class HangMan {
	private Speler speler;
	private WoordenLijst woordenlijst;
	private HintWoord woord;
	private TekeningHangMan tekening;
	
	public HangMan(Speler speler, WoordenLijst woordenlijst) {
		setSpeler(speler);
		setWoordenlijst(woordenlijst);
		initTekening();
		woord = new HintWoord(this.woordenlijst.getRandomWoord());
	}
	
	public String getHint() {
		return woord.toString();
	}
	
	public Speler getSpeler() {
		return speler;
	}
	
	public TekeningHangMan getTekening() {
		return tekening;
	}
	
	public void raadLetter(char letter) {
		
	}
	
	public boolean isGameOver() {
		if(tekening.getAantalOnzichtbaar() == 0) return true;
		else return false;
	}
	
	public boolean isGewonnen() {
		return woord.isGeraden();
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
	
	private void initTekening() {
		tekening = new TekeningHangMan("hangman");
		tekening.reset();
	}

	public void raad(char c) {
		if(!woord.raad(c)) tekening.setVolgendeZichtbaar();
	}
	
}
