package domain;

import java.util.ArrayList;

public class WoordenLijst {
	ArrayList<String> woordenLijst;
	
	public WoordenLijst() {
		woordenLijst = new ArrayList<String>();
	}
	
	public int getAantalWoorden() {
		return this.woordenLijst.size();
	}
	
	public void voegToe(String woord) {
		if (woord == null || woord.trim().isEmpty()) throw new DomainException("Woord mag niet null/leeg zijn.");
		for(String w : this.woordenLijst) {
			if (w.equals(woord)) throw new DomainException("Dit woord zit al in de lijst.");
		}
		woordenLijst.add(woord);
	}
	
	public String getRandomWoord() {
		if (this.getAantalWoorden() <1) return null;
		int random = (int) Math.floor(Math.random()*this.getAantalWoorden());
		return woordenLijst.get(random);
	}
	
}
