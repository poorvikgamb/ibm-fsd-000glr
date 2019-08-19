package third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC {
	private static Properties properties=null;
	private static Scanner scanner=new Scanner(System.in);
	
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/hello");
		properties.put("USER", "root");
		properties.put("PASSWORD", "1310");
	}

	public  JDBC(){
		super();
	}
	
	public static void main(String [  ] args)throws ClassNotFoundException, SQLException
	{
      Database factory=Database.createConncection();
		
		Connection connection=factory.getConnection();
		PreparedStatement pst=connection.prepareStatement("insert into course values(?,?)");
		System.out.print("ID: ");
		int id=scanner.nextInt();
		System.out.print("NAME: ");
		String name=scanner.next();
		System.out.print("AMOUNT: ");
		int amount=scanner.nextInt();
		pst.setInt(1, id);
		pst.setString(2, name);
		System.out.println("row(s) updated");
	}

}

