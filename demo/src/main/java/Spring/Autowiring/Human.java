package Spring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {
        public static void main(String args[])
        {
        	ApplicationContext context = new ClassPathXmlApplicationContext("AutoWire.xml");
        	System.out.println("Config loaded");
        	
            Body body = context.getBean("body",Body.class);
            body.checkAlive();
        	
        }
}
