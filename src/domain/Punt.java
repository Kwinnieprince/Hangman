package domain;

public class Punt {
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
	public boolean equals(Object object) {
		if (object == null) return false;
		
		return this.x == ((Punt) object).getX() && this.y == ((Punt) object).getY();
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
