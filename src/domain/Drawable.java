package domain;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Drawable {

	public void teken(Graphics graphics) {
		
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setStroke(new BasicStroke(5));
		
		//Uitleg van meneer volgt nog

//		Cirkel boomkruin = new Cirkel(new Punt(70, 70), 60);
//		LijnStuk boomstam = new LijnStuk(new Punt(70, 130), new Punt(70, 380));
//		Rechthoek gebouw = new Rechthoek(new Punt(100, 200), 200, 180);
//		Driehoek dak = new Driehoek(new Punt(100, 200), new Punt(300, 200),
//				new Punt(200, 100));
//
//		graphics.drawOval(boomkruin.getOmhullende().getMinX(), boomkruin
//				.getOmhullende().getMinY(), boomkruin.getOmhullende()
//				.getBreedte(), boomkruin.getOmhullende().getHoogte());
//
//		graphics.drawRect(gebouw.getLinkerBovenhoek().getX(), gebouw
//				.getLinkerBovenhoek().getY(), gebouw.getBreedte(), gebouw
//				.getHoogte());
//
//		graphics.drawLine(boomstam.getStartPunt().getX(), boomstam
//				.getStartPunt().getY(), boomstam.getEindPunt().getX(), boomstam
//				.getEindPunt().getY());
//
//		int[] xPoints = { dak.getHoekPunt1().getX(), dak.getHoekPunt2().getX(),
//				dak.getHoekPunt3().getX() };
//		int[] yPoints = { dak.getHoekPunt1().getY(), dak.getHoekPunt2().getY(),
//				dak.getHoekPunt3().getY() };
//		graphics.drawPolygon(xPoints, yPoints, 3);
	}

	
}
