package Assigment1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDO {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Employee emp[];
	static Date date;
	private static int id=1;
	private static String name;
	private static String department;
    private	static String doj;
    private static int age;
    private static int salary;
    private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input the number of employess");
		count = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("input the details of employee"+(id+i));
			name = sc.next();
			department = sc.next();
			doj = sc.next();
			DateFormat sdf = new SimpleDateFormat(" dd mm yyyy");
			try {
				 date = sdf.parse(doj);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			age = sc.nextInt();
			salary = sc.nextInt();
			emp[i] = new Employee(id, name, department, date, age, salary);
		}
		
		System.out.println(" 1 - sort employees by salary");
		
		System.out.println("2 - sort employees by age");
		
		System.out.println("enter choice");
		
		int choice;
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			for(int i=0;i<choice-1;i++)
			{
				if(emp[i].compareTo(emp[i+1])==1)
				{
					System.out.println(emp);					
				}
			}
			break;
			
		case 2:
			for(int i=0;i<choice-1;i++)
			{
				
			}
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
		

	}

}
