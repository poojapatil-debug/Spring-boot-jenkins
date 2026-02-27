package com.example.Spring_boot_jenkins;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("application started");
	}

	public static void main(String[] args)
	{
		logger.info("application exec");

		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
