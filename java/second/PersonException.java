package comm.second;

public class PersonException extends Throwable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	String message;

	public PersonException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
