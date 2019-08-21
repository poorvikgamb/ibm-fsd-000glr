package Employee;

import java.util.List;

public interface EmployeeDao {
	
	public void createEmployee (EmployeeDetails emp);
	public List<EmployeeDetails> getAllEmployess();
	public EmployeeDetails getEmployeeById(int id);
	public void updateEmployee (EmployeeDetails emp);
	public void deleteEmployee (EmployeeDetails emp);
	
}
