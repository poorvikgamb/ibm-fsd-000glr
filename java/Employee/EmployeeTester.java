package Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeTester {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		
		EmployeeService service = new EmployeeServiceImp();
		
		int choice=0;
		
		do {
			System.out.println("1.create employee");
			System.out.println("2.display all employee");
			System.out.println("0. exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("enter id");
				Integer id=sc.nextInt();
				System.out.println("enter first name");
				String firstName=sc.next();
				System.out.println("enter last name");
				String lastName=sc.next();
				System.out.println("enter email");
				String email=sc.next();
				service.createEmployee(new EmployeeDetails(id,firstName,lastName,email));
				break;
			case 2:
				List<EmployeeDetails> list = service.getAllEmployess();
				for(EmployeeDetails e:list)
				{
					System.out.printf("%d %s %s %s",e.getId(),e.getFirstName(),e.getLastName(),e.getEmail());
				}
				break;
			case 0:
				System.out.println("goodbye");
				System.exit(0);
				break;
			default :
				System.out.println("wrong choice");
				break;
			}
		}while(choice<3);

	}

}
