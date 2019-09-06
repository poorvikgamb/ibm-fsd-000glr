package Poorvik.DataSourceAnnotation.bean;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DataSource extends BasicDataSource{
	
	@Value("jdbc:mysql://localhost:3306/apache")
	String url;
	@Value("root")
	String username;
	@Value("1310")
	String password;
	@Value("com.mysql.jdbc.Driver")
	String driverClassName;

@PostConstruct
public void createDataSource() {
	setUrl("jdbc:mysql://localhost:3306/apache");
	setUsername("root");
	setPassword("1310");
	setDriverClassName("com.mysql.jdbc.Driver");
	System.out.println("connection set up");
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDriverClassName() {
	return driverClassName;
}

public void setDriverClassName(String driverClassName) {
	this.driverClassName = driverClassName;
}

}
