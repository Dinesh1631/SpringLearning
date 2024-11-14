package Mobile.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
     public static void main(String args[])
     {
    	 @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("MoblieBeans.xml");
    	 Airtel airtel = (Airtel) context.getBean("airtel");
    	 System.out.println("Config loaded");
    	 airtel.calling();

    	 
     }
}
