package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");
    	
    	JavaTrainer jt=(JavaTrainer)cpx.getBean("jtrainer");
        System.out.println(jt);
        System.out.println(jt.getName());
        
        SQLTrainer st=(SQLTrainer)cpx.getBean("strainer");
        System.out.println(st);
        System.out.println(st.getName());
        
        WebTrainer wt=(WebTrainer)cpx.getBean("wtrainer");
        System.out.println(wt);
        System.out.println(wt.getName());
        
    }
}
