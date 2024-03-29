package domain;

import java.awt.Graphics;

public class Punt extends Vorm{
	private int x;
	private int y;
	
	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	@Override
	public Omhullende getOmhullende() {
		return null;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) return false;
		
		return this.x == ((Punt) object).getX() && this.y == ((Punt) object).getY();
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	public void teken(Graphics graphics) {
		if(this.isZichtbaar())
		graphics.drawLine(this.x, this.y, this.x, this.y);
		
	}
}
