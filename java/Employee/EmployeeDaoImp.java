package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDaoImp implements EmployeeDao {
	
	private Connection connection = null;
	private MyConnectionFactory factory = null;
	private java.sql.Statement statement = null;
	private PreparedStatement pStatement = null;
	private ResultSet resultset = null;
	EmployeeDetails emp = new EmployeeDetails();
	
	
	public EmployeeDaoImp() throws SQLException {
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
	}


	@Override
	public void createEmployee(EmployeeDetails emp) {
		try {
			pStatement = connection.prepareStatement("insert into employee value(?,?,?,?)");
			pStatement.setInt(1,emp.getId());
			pStatement.setString(2,emp.getFirstName());
			pStatement.setString(3, emp.getLastName());
			pStatement.setString(4,emp.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			
		}
		
	}


	@Override
	public List<EmployeeDetails> getAllEmployess() {
		// TODO Auto-generated method stub
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from employee");
			while(resultset.next())
			{
				list.add(new EmployeeDetails(resultset.getInt(1),
						resultset.getString(2),
					    resultset.getString(3),
						resultset.getString(4)
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();			
		}
		return list;
	}


	@Override
	public EmployeeDetails getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		try {
			pStatement = connection.prepareStatement("epdate ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public void deleteEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
