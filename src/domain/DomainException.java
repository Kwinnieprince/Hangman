package domain;

public class DomainException extends RuntimeException {
	
	private String message;

	public DomainException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}
	
	
}
