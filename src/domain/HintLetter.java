package domain;

import java.util.regex.*;

public class HintLetter {
	private String letter;
	
	public HintLetter(String letter) {
		setLetter(letter);
	}

	private void setLetter(String letter)throws DomainException {
		boolean p = Pattern.matches("^[a-z] {1}$", letter);
		if(p == false) throw new DomainException("Ongeldige letter.");
		this.letter = letter;	
	}
	
}
