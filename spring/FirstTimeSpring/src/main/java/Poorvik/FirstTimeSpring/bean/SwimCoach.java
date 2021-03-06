package Poorvik.FirstTimeSpring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	public String getDailyWorkOut() {
		return null;
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("{foo.team}")
	private String team;
	
	private Luck luck;

	@Autowired
	public SwimCoach(Luck luck) {
		super();
		this.luck = luck;
	}

	public SwimCoach() {
		super();
	}

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

	public Luck getLuck() {
		return luck;
	}

	public void setLuck(Luck luck) {
		this.luck = luck;
	}
	
	@PostConstruct
	public void setWaterLevel()
	{
		System.out.println("make water level high");
	}
	
	@PreDestroy
	public void destroySwim()
	{
		System.out.println("pre destroy called . . ");
	}


}
