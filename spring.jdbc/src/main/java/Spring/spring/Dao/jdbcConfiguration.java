package Spring.spring.Dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration()
@ComponentScan(basePackages = "Spring.spring.Dao")
public class jdbcConfiguration {
	@Bean("datasource")
    public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/dineshdb");
		ds.setUsername("root");
		ds.setPassword("Dinesh@123");
    	return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
    	JdbcTemplate jt = new JdbcTemplate();
    	jt.setDataSource(getDataSource());
		return jt;	
    }
    
}
