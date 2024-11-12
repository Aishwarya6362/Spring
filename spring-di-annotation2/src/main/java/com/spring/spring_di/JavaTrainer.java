package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jtrainer")
@Scope("prototype") 
public class JavaTrainer {
	private String Name;
	
	public JavaTrainer() {
		super();
	}
	
	@Autowired
	public JavaTrainer(@Value("Rudresh") String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}
