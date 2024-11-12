package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("strainer")
@Scope("prototype") 
public class SQLTrainer {
	private String Name;
	
	public SQLTrainer() {
		super();
	}
	
	@Autowired
	public SQLTrainer(@Value("Siddu") String name) {
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
