package Poorvik.Annotaions.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component

public class JTemplate extends JdbcTemplate {
	
	@Autowired
	private DataSource dataSource;
	{
		System.out.println(dataSource);
	}
	
	private javax.sql.DataSource ds= dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JTemplate(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	

}
