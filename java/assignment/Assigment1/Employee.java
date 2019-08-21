package Assigment1;

import java.util.*;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String department;
    private	Date doj;
    private int age;
    private int salary;
    
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, String department, Date doj, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.doj = doj;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(emp.salary > this.salary)
		{
			return 1;
		}
		return 0;
	}
	
	
	
	}
    

