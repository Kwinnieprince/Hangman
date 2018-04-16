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
	public void setNaam(String naam) throws IllegalArgumentException {
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
			throw new DomainException("Score kan niet kleiner dan nul zij.");
		}
		this.score = score;
	}
	
	
	public void addToScore(int getal) throws DomainException  {
		if (this.getScore() + getal < 0) {
			throw new DomainException("Score kan niet negatief worden.");
		}
		this.setScore(this.getScore() + getal);
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		Speler speler2 = (Speler)o;
		return this.getNaam().equals(speler2.getNaam()) && this.getScore() == speler2.getScore();
	}
	
	public String toString() {
		return "Speler: " + this.getNaam() + ", met score : " + this.getScore();
		
	}

}
