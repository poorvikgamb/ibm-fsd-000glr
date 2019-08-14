package comm.second;

public class TennisCoach {

	private String name;
	private Level level;
	
	public TennisCoach() {
		super();
	}
	
	public String getDailyWorkout() {
		return "practise back volley today";
	}
	
	public void createCoach() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}
	
	public String getCoachDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("today workout plan"+getDailyWorkout()+"");
		return null;
	}
	
	
}
