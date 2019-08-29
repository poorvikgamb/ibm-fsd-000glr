package model;

public class Login {
	String user;
	String pass;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String validate(String user,String pass)
	{
		this.user = user;
		this.pass = pass;
		if(user.equals("admin") && pass.equals("admin"))
			return "valid";
		else
			return "invalid";
	}

}
