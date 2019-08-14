package comm.second;

import java.util.Scanner;

public class Tester {

	public static void main(String [] args) {
		/*Scanner scanner = new Scanner(System.in);
		String fisrtName;
		String lastName;
		int i=0;
		
		Person p[  ] = new Person[10];
		
		do{
			System.out.println("enter first name");
			try {
				scanner.next(p[i].firstName);
				p[i].verifayName(p[i].firstName);
			} catch (PersonException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
			System.out.println("enter last name");
			scanner.next(p[i].lastName);
			try {
				p[i].verifayName(p[i].lastName);
			} catch (PersonException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
			i++;
		}while((p[i].equals(p[i-1]))!=true);*/
		
		CollectionDemo demo = new CollectionDemo();
		
		demo.diplayCollection();
		 
	}
}
