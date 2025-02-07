package com.jdbc.Configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.jdbc")
public class webAppConfiguration {
	@Bean
	public JdbcTemplate getjdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
	public DataSource getDataSource() {
		DriverManagerDataSource DS = new DriverManagerDataSource();
		DS.setUsername("root");
		DS.setPassword("Dinesh@123");
		DS.setDriverClassName("com.mysql.cj.jdbc.Driver");
		DS.setUrl("jdbc:mysql://localhost:3306/dineshdb");
		return DS;	
	}

}
