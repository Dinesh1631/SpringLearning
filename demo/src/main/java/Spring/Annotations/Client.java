package Spring.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String args[]) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
    	System.out.println("Config file loaded");
    	College college = context.getBean("college",College.class);
    	college.print();
    	college.techerInfo();
    	
    	
    }
}
