package domain;

public abstract class Vorm implements Drawable {

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
	
	public abstract Omhullende getOmhullende();
}
