package Poorvik.FirstTimeSpring.bean;

public class CricketCoach implements Coach{
	
	private Luck luck;

	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "cricket";
	}

	public CricketCoach(Luck luck) {
		super();
		this.luck = luck;
	}
	
	public String getMyLuck()
	{
		return luck.getLuck();
	}
	
}