package exception;

public class PasswordFormatException extends Exception {
	public PasswordFormatException(String password) {
		super(password);
	}
}
