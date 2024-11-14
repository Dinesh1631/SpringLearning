package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringIOC.Sim;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/*This Application context helps us to create objects for class mentioned in .xml
		 * and helps us to manage them.Beacuse of this we can avoid tight coupling.
		 * "Beans" are nothing but objects in the IOC container.
		 * 2 IOC Containers:Bean Factory(legacy),ApplicationContext(Modern).
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config file is loaded");
/* To make these things configurable we will use sim Interface refrence.
		Airtel air = (Airtel)context.getBean("airtel");
		air.calling();
		air.data();
	    Idea idea = context.getBean("idea",Idea.class);
	    idea.calling();
	    idea.data(); 
	    */
		
		@SuppressWarnings("unused")
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
		
		
	}

}
