package domain;

public abstract class Vorm {
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o instanceof Vorm) {
			return true;
		} else return false;
	}
}