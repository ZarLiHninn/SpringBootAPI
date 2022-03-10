package com.ec2sample.app.ec2demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJdbcRepositories(basePackages = "com.ec2sample.app.ec2demo")
public class Config extends AbstractJdbcConfiguration{

	@Bean("dataSource")
    public DataSource mysqlDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/userdata");
        dataSource.setUsername("root");
        dataSource.setPassword("thiri2896");
        return dataSource;
    }
	@Bean
	NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource)
	{
	    return new NamedParameterJdbcTemplate(dataSource);
	}
	 @Bean
	 public PlatformTransactionManager transactionManager(DataSource dataSource){
	     return new DataSourceTransactionManager(dataSource);
	 }
}