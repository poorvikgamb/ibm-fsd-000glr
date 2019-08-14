package comm.second;

public class NameEqualsException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String message;
	 
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public NameEqualsException(String message) {
		super();
		this.message = message;
	}
	 
}
