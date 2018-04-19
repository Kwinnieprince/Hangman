package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import domain.TekeningHangMan;

public class TekeningHangManTest {

	@Before
	public void setUp() {
	}
	
	@Test
	public void TekeningHangMan_heeft_geen_onzichtbare_stukken_bij_aanmaak() {
		TekeningHangMan hangman = new TekeningHangMan("hangman");
		assertEquals(0, hangman.getAantalOnzichtbaar());
	}
	
	@Test
	public void TekeningHangMan_heeft_14_onzichtbaar_na_reset() {
		TekeningHangMan hangman = new TekeningHangMan("hangman");
		hangman.reset();
		assertEquals(14, hangman.getAantalOnzichtbaar());
	}
	
	@Test
	public void TekeningHangMan_heeft_13_onzichtbaar_na_reset_setVolgendeZichtbaar(){
		TekeningHangMan hangman = new TekeningHangMan("hangman");
		hangman.reset();
		hangman.setVolgendeZichtbaar();
		assertEquals(13, hangman.getAantalOnzichtbaar());		
	}
	
	@Test
	public void TekeningHangMan_heeft_5_onzichtbaar_na_reset_en_9_setvolgendezichtbaar() {
		TekeningHangMan hangman = new TekeningHangMan("hangman");
		hangman.reset();
		for(int i = 0; i < 9; i++) {
			hangman.setVolgendeZichtbaar();
		}
		assertEquals(5, hangman.getAantalOnzichtbaar());
	}
}
