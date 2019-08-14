package comm.second;

public class AccountNotValidException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public AccountNotValidException(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
