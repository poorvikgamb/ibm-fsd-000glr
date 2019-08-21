package Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImp implements EmployeeService {
	
	private EmployeeDao employee = null;
	
	 public EmployeeServiceImp() throws SQLException
	{
		// TODO Auto-generated constructor stub
		 employee = new EmployeeDaoImp();
	}

	@Override
	public void createEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		employee.createEmployee(emp);
		
	}

	@Override
	public List<EmployeeDetails> getAllEmployess() {
		// TODO Auto-generated method stub
		return employee.getAllEmployess();
	}

	@Override
	public EmployeeDetails getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
