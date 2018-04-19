package domain;

import java.util.ArrayList;

public class HintWoord {
	private ArrayList<HintLetter> letters;
	private String woord;
	
	public HintWoord(String woord) {
		letters = new ArrayList<HintLetter>();
		setWoord(woord);
	}
	
	private void setWoord(String woord) {
		if (woord == null || woord.trim().isEmpty()) throw new DomainException("Woord mag niet null zijn.");
		char[] letters = woord.toCharArray();
		HintLetter hintLetter = null;
		for (char letter : letters) {
			hintLetter = new HintLetter(letter);
			this.letters.add(hintLetter);
		}
		this.woord = woord;
	}

	public String toString() {
		String woord = "";
		for (HintLetter letter : this.letters) {
			woord+=letter.toChar() + " ";
		}
		return woord.substring(0, woord.length()-1);
	}
	
	public String getWoord() {
		return this.woord;
	}

	public boolean isGeraden() {
		for(HintLetter x : letters) {
	
			if(!x.isGeraden())return false;
		}
		return true;
	}

	public boolean raad(char c) {
		boolean b = false;
		for(HintLetter x : letters) {
			if(x.raad(c)) b = true;
		}
		return b;
	}

}
