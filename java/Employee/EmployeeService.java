package Employee;

import java.util.List;

public interface EmployeeService {

	public void createEmployee (EmployeeDetails emp);
	public List<EmployeeDetails> getAllEmployess();
	public EmployeeDetails getEmployeeById(int id);
	
}
