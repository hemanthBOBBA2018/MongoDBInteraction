package com.hemanth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.hemanth"} )
public class Config {
	
	

}
