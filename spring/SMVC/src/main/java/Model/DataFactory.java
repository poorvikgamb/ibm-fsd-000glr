package Model;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;


@Component(value="dataSource")
public class DataFactory extends BasicDataSource{

	@PostConstruct
	public void DataSourceCreate()
	{
		setDriverClassName("com.mysql.jdbc.Driver");
		setUrl("jdbc:mysql://localhost:3306/apache");
		setUsername("root");
		setPassword("1310");
	}
}
