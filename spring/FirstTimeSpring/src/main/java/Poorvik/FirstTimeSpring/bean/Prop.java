package Poorvik.FirstTimeSpring.bean;

public class Prop {
	
	String email;
	String team;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Prop() {
		super();
	}
	public Prop(String email, String team) {
		super();
		this.email = email;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Prop [email=" + email + ", team=" + team + "]";
	}

}
