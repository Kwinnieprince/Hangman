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
		/*String s = "" + letter;
		boolean p = Pattern.matches("^[a-z] {1}$", s);
		if(p == false) throw new DomainException("Ongeldige letter.");*/
		this.letter = letter;	
	}

	public boolean isGeraden() {
		return false;
	}

	public boolean raad(char c) {
		return false;
	}

	public Object toChar() {
		
		return null;
	}

	public Object getLetter() {
		return null;
	}
	
	
	
	
	
}
