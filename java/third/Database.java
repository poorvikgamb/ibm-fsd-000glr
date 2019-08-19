package third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Connection connection=null;
	private static Database connectionFactory;
	
	public Database()throws SQLException
	{
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","1310");
	}
	
	public static Database createConncection() throws SQLException
	{
		if(connectionFactory == null)
		{
			connectionFactory = new Database();
		}
		return connectionFactory;
	}
	
	public Connection getConnection()throws SQLException
	{
		return connection;
	}
	
}
