package Spring.spring.Aspect;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.spring.Services.shapeServices;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
	  shapeServices service = context.getBean("services",shapeServices.class);
	   System.out.println(service.getCircel().getName());
	   
  }
}
