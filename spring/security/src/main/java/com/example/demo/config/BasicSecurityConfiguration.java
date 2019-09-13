package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class BasicSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication

		UserBuilder users = User.withDefaultPasswordEncoder();

		auth.inMemoryAuthentication()
			.withUser(users.username("am").password("noobam").roles("EMPLOYEE"))
			.withUser(users.username("pa").password("noobpa").roles("EMPLOYEE","MANAGER"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").hasRole("EMPLOYEE")
		.antMatchers("/addLeague/**").hasRole("MANAGER")
		.and()
			.formLogin()
				.permitAll()
		.and()
			.logout()
				.permitAll();
	}
}