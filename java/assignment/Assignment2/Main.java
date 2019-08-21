package Assignment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		String password = sc.next();
		if(UserMainCode.checkPassword(password))
		{
			System.out.println("valid password");
		}else {
			System.out.println("invalid password");
		}
			
	}

}
