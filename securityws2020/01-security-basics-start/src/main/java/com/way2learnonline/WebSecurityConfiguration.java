package com.way2learnonline;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;



@Configuration
@Order(2)
// TODO-2 Make the below class to extend WebSecurityConfigurerAdapter
public class WebSecurityConfiguration //extends WebSecurityConfigurerAdapter 
{
	
	// TODO-3 Uncomment the below to add httpBasic authentication for your app
	
	/*
	protected void configure(HttpSecurity http) throws Exception {		
		
		  http .authorizeRequests() 
		  		.anyRequest().authenticated() 
		  		.and() .httpBasic();
		
	}
	
	*/
	
	
	
	//TODO-11 uncomment the below to configure jdbc authentication using DelegatingPasswordEncoder
	
	/*
	  
	  
	 @Autowired
	private DataSource dataSource;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource).passwordEncoder(passwordEncoder);
	}	
	
	
	*/
	
}
