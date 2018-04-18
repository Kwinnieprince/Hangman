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
		this.woord = woord;
	}

	public Object getWoord() {
		return null;
	}

	public boolean isGeraden() {
		for(HintLetter x : letters) {
			if(x.equals('-')) return false;
		}
		return true;
	}

	public boolean raad(char c) {
		for(HintLetter x : letters) {
			if(x.equals(c)) return true;
		}
		return false;
	}

}
