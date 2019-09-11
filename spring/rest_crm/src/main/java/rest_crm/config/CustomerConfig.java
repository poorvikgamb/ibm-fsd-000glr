package rest_crm.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jca.support.LocalConnectionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="rest_crm.config")
public class CustomerConfig implements WebMvcConfigurer{
	
	@Bean
	public DataSource myDataSource()
	{
		ComboPooledDataSource myDataSource = new ComboPooledDataSource();
		myDataSource.setUser("root");
		try {
			myDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/neaon");
		myDataSource.setPassword("1310");
		myDataSource.setMinPoolSize(10);
		myDataSource.setMaxPoolSize(20);
		myDataSource.setMaxIdleTime(30000);
		
		return myDataSource;
	}
	
	@Bean
	public LocalConnectionFactoryBean sessionFactory()
	{
		
		return null;
		
	}

}
