package domain;

import java.util.regex.*;

public class HintLetter {
	private char letter;
	private boolean isGeraden;
	
	public HintLetter(char letter) {
		setLetter(letter);
		isGeraden = false;
	}

	private void setLetter(char letter)throws DomainException {
		String s = "" + letter;
		boolean p = Pattern.matches("^[a-zA-Z ]{1}$", s);
		if(!p) throw new DomainException("Ongeldige letter.");
		this.letter = letter;	
	}

	public boolean isGeraden() {
		return this.isGeraden;
	}

	public boolean raad(char c) {
		String s = "" + c;
		boolean p = Pattern.matches("^[a-zA-Z]{1}$", s);
		if(!p) throw new DomainException("Ongeldige letter.");
		if (this.isGeraden) return false;
		if (Character.toLowerCase(c)==Character.toLowerCase(this.letter)) {
			this.isGeraden = true;
			return true;
		} else return false;
	}

	public Object toChar() {
		if (this.isGeraden()) return this.getLetter();
		if (this.letter == ' ') {
			this.isGeraden = true; 
			return "  ";
		}
		return '_';
	}

	public Object getLetter() {
		return this.letter;
	}
	
	
	
	
	
}
