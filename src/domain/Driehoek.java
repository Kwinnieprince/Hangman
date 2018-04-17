package domain;

import java.awt.*;

public class Driehoek extends Vorm {
	
	private Punt hoekPunt1;
	private Punt hoekPunt2;
	private Punt hoekPunt3;
	
	public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) throws DomainException {
		this.setHoekPunten(hoekPunt1, hoekPunt2, hoekPunt3);
	}

	public Punt getHoekPunt1() {
		return hoekPunt1;
	}

	public Punt getHoekPunt2() {
		return hoekPunt2;
	}

	public Punt getHoekPunt3() {
		return hoekPunt3;
	}
	
	public void setHoekPunten(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) throws DomainException {
		if (hoekPunt1 == null || hoekPunt2 == null || hoekPunt3 == null) {
			throw new DomainException("Hoekpunt kan niet null zijn.");
		}
		if (hoekPunt1.equals(hoekPunt2) || hoekPunt2.equals(hoekPunt3) || hoekPunt3.equals(hoekPunt1)) {
			throw new DomainException("Hoekpunten kunnen niet gelijk zijn.");
		}
		//(x2-x1)*(y3-y1) = (x3-x1)*(y2-y1)
		if ( (hoekPunt2.getX() - hoekPunt1.getX()) * (hoekPunt3.getY() - hoekPunt1.getY()) == 
				(hoekPunt3.getX() - hoekPunt1.getX()) * (hoekPunt2.getY() - hoekPunt1.getY()) ) {
			throw new DomainException("De drie hoekpunten mogen niet op 1 lijn liggen.");
		}
		this.hoekPunt1 = hoekPunt1;
		this.hoekPunt2 = hoekPunt2;
		this.hoekPunt3 = hoekPunt3;
	}

	public void teken(Graphics graphics){

	}

	@Override
	public Omhullende getOmhullende() {
		return null;
	}

	@Override
	public boolean equals(Object o) {
		Driehoek d;
		if (o instanceof Driehoek) {
			d = (Driehoek)o;
		} else {
			return false;
		}
		
		return (d.getHoekPunt1() == this.hoekPunt1 && d.getHoekPunt2() == this.hoekPunt2 && d.getHoekPunt3() == this.hoekPunt3) ||
				(d.getHoekPunt1() == this.hoekPunt2 && d.getHoekPunt2() == this.hoekPunt3 && d.getHoekPunt3() == this.hoekPunt1) ||
				(d.getHoekPunt1() == this.hoekPunt3 && d.getHoekPunt2() == this.hoekPunt1 && d.getHoekPunt3() == this.hoekPunt2) ||
				
				(d.getHoekPunt1() == this.hoekPunt1 && d.getHoekPunt2() == this.hoekPunt3 && d.getHoekPunt3() == this.hoekPunt2) ||
				(d.getHoekPunt2() == this.hoekPunt2 && d.getHoekPunt1() == this.hoekPunt3 && d.getHoekPunt3() == this.hoekPunt1) || 
				(d.getHoekPunt3() == this.hoekPunt3 && d.getHoekPunt1() == this.hoekPunt2 && d.getHoekPunt2() == this.hoekPunt1);		
	}
	
	@Override
	public String toString() {
		return "Driehoek: hoekpunt 1: " + this.hoekPunt1.toString() + " - hoekpunt 2: " + this.hoekPunt2.toString() + " - hoekpunt3: " + this.hoekPunt3.toString() + "\n" + this.getOmhullende().toString();
	}

	@Override
	public Omhullende getOmhullende() {
		int minX = Math.min(Math.min(this.hoekPunt1.getX(), this.hoekPunt2.getX()), this.hoekPunt3.getX());
		int minY = Math.min(Math.min(this.hoekPunt1.getY(), this.hoekPunt2.getY()), this.hoekPunt3.getY());
		Punt positieLinksBoven = new Punt(minX, minY);
		int breedte = Math.max(Math.max(this.hoekPunt1.getX(), this.hoekPunt2.getX()), this.hoekPunt3.getX()) - minX;
		int hoogte = Math.max(Math.max(this.hoekPunt1.getY(), this.hoekPunt2.getY()), this.hoekPunt3.getY()) - minY;
		Omhullende omhullende = new Omhullende(positieLinksBoven, breedte, hoogte);
		return omhullende;
	}

}
