package com.uniam.config;

import com.uniam.pojo.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringCongfig {
	
	@Bean //creating a bean class object and setting a value 
	public HelloWorld getBean()
	{
		HelloWorld hello = new HelloWorld();
		hello.setMessage("Welcome bros");
		return hello;
				
	}


}
