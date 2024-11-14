package SpringDIAdv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
     public static void main(String args[])
     {
    	 @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAdv.xml");
    	 System.out.println("Config file is loaded");
    	 Student stu = context.getBean("student",Student.class);
    	 stu.cheat();
    	 stu.sudentInfo();
    	 
    	
     }
}
