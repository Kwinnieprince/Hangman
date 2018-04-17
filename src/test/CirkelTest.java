package test;

import static org.junit.Assert.*;

import domain.*;
import org.junit.Before;
import org.junit.Test;

public class CirkelTest {

	private Punt punt = new Punt(10, 20);
	private int radius = 15;
	
	@Test
	public void Geldige_cirkel_aanmaken_met_geldige_parameters() {
		Cirkel cirkel = new Cirkel(punt, radius); 
		assertEquals(cirkel.getMiddelpunt(), punt);
		assertEquals(cirkel.getRadius(), radius);
	}
	
	@Test
	public void Cirkel_geeft_juiste_omhullende_terug() {
		Cirkel cirkel = new Cirkel(punt, radius); 
		Omhullende omhullende = cirkel.getOmhullende();
		assertTrue(omhullende.equals(cirkel.getOmhullende()));
	}
}
