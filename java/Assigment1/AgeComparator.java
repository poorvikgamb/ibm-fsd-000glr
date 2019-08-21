package Assigment1;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getAge() > emp2.getAge())
		{
			return 1;
		}
		else if(emp1.getAge() < emp2.getAge())
		{
			return 2;
		}
		else
		{
			if(emp1.getDoj().compareTo(emp2.getDoj())>0)
			{
				return 3;
			}
			else
			{
				return 4;
			}
		}
	
	}
	

}
