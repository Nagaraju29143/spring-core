package spring.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="spring.dao")
public class EmployeeConfig {
	
	@Bean("dmds")
    public DataSource getDriverManagerDataSource() { 
		  DriverManagerDataSource dataSource =new DriverManagerDataSource();
		 
		  dataSource.setDriverClassName("org.postgresql.Driver");
		  dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		  dataSource.setUsername("postgres");
		  dataSource.setPassword("postgres123$");
		  
		  return dataSource; 
		}
	
	@Bean("bds")
    public DataSource getBasicDataSource() { 
		 
		  BasicDataSource dataSource =new BasicDataSource();
		  
		 //setter injection
		  dataSource.setDriverClassName("org.postgresql.Driver");
		  dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		  dataSource.setUsername("postgres");
		  dataSource.setPassword("postgres123$");
		  
		  dataSource.setInitialSize(100);
		  dataSource.setMinIdle(5);
		  dataSource.setMaxIdle(10);
		  
		  return dataSource; 
		}
	
	

	@Bean
	public JdbcTemplate getJdbcTemplate(@Qualifier("bds") DataSource ds) {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(ds);
		//jdbcTemplate.setDataSource(ds);
		return jdbcTemplate;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(@Qualifier("bds") DataSource ds) {
		
		//constructor injection
		NamedParameterJdbcTemplate namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(ds);
		return namedParameterJdbcTemplate;
		
	}
	
	
}
