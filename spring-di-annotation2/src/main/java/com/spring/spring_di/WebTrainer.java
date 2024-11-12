package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wtrainer")
//@Scope("prototype") 
public class WebTrainer {
	private String Name;
	
	public WebTrainer() {
		super();
	}
	
	@Autowired
	public WebTrainer(@Value("Bharath") String name) {
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
