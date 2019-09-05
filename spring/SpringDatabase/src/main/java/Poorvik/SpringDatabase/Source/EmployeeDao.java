package Poorvik.SpringDatabase.Source;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void createEmployee(Employee employee)
	{
		String query = "insert into emp1(name) values(?)";
		Object obj[ ]= {employee.getName()};
		template.update(query,obj);
		System.out.println("done");
	}
	

}
