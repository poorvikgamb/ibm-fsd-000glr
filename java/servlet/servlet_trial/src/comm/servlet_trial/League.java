package comm.servlet_trial;

import java.io.Serializable;

public class League implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private int year;
	private String season;
	//paramaeterized constructor
	public League(String title, int year, String season) {
		super();
		this.title = title;
		this.year = year;
		this.season = season;
	}
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}

}
