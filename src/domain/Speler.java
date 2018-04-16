package domain;

public class Speler {
	
	private String naam;
	private int score;
	
	public Speler(String naam) {
		this.setNaam(naam);
		this.setScore(0);
	}
	
	public String getNaam() {
		return naam;
	}
	private void setNaam(String naam) throws IllegalArgumentException {
		if (naam == null || naam.trim().isEmpty()) {
			throw new DomainException("Naam kan niet null of leeg zijn.");
		}
		this.naam = naam;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) throws DomainException {
		if (score < 0) {
			throw new DomainException("Score kan niet kleiner dan nul zijn.");
		}
		this.score = score;
	}
	
	
	public void addToScore(int getal) throws DomainException  {
		if (this.score + getal < 0) {
			throw new DomainException("Score kan niet negatief worden.");
		}
		this.setScore(this.score + getal);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		Speler speler2 = (Speler)o;
		return this.naam.equals(speler2.getNaam()) && this.score == speler2.getScore();
	}
	
	@Override
	public String toString() {
		return "Speler: " + this.naam + ", met score : " + this.score;
	}

}
