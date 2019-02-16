package com.hemanth.MongoInterface.MongoDBInteraction;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;






@ComponentScan("com.hemanth.config")
@SpringBootApplication()

public class MongoDbInteractionApplication {

	final static Logger logger = Logger.getLogger(MongoDbInteractionApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbInteractionApplication.class, args);
	}

}

