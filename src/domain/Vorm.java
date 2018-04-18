package domain;

public abstract class Vorm implements Drawable {
	
	private boolean zichtbaar = false;

	public abstract Omhullende getOmhullende();

	public boolean equals(Object o) {
		if (o == null) return false;
		if (o instanceof Vorm) {
			return true;
		} else return false;
	}

	public String toString() {
		return null;
	}
	
	public boolean isZichtbaar() {
		return zichtbaar;
	}
	
	public void setZichtbaar(boolean bool) {
		this.zichtbaar = bool;
	}
}
