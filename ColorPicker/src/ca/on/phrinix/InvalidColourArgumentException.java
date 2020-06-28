package ca.on.phrinix;

import javax.servlet.ServletException;

public class InvalidColourArgumentException extends ServletException {

	private static final long serialVersionUID = 1L;
	public InvalidColourArgumentException() {
		
	}

	public InvalidColourArgumentException(String message) {
		super(message);
		
	}

	public InvalidColourArgumentException(Throwable rootCause) {
		super(rootCause);
		
	}

	public InvalidColourArgumentException(String message, Throwable rootCause) {
		super(message, rootCause);
		
	}

}
