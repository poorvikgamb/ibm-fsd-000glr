package Poorvik.FirstTimeSpring.bean;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value(value = "")
	int id;
	@Value(value = "")
	String name;
	@Value(value = "")
	String email;
	 	
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
