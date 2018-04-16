package domain;

public class Punt {
	private int x;
	private int y;
	
	public Punt(int x, int y) {
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString(){
		return "(" + getX() + ", " + getY() + ")";
	}
}
