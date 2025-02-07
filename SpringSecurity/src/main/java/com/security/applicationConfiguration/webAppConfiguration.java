package com.security.applicationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com")
public class webAppConfiguration {
	@Bean
	public ViewResolver viewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
	
	@Bean()
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource DS = new DriverManagerDataSource();
		DS.setUsername("root");
		DS.setPassword("Dinesh@123");
		DS.setDriverClassName("com.mysql.cj.jdbc.Driver");
		DS.setUrl("jdbc:mysql://localhost:3306/dineshdb");
		return DS;
	}
	@Bean()
	JdbcTemplate tempate() {
		return new JdbcTemplate(getDataSource());
	}
	@Bean(name="JdbcUserDetailsManager")
	JdbcUserDetailsManager jdbcUserDetailsManager(){
		return new JdbcUserDetailsManager(getDataSource());
	}
	
}
