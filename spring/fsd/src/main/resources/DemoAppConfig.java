import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages = "")
public class DemoAppConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		
		UserBuilder users = User.withUserDetails();
	}
	

}
