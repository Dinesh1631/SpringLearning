package SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DI {
   public static void main (String args[])
   {
	   ApplicationContext context = new ClassPathXmlApplicationContext("beansDI.xml");
       Student din = context.getBean("student",Student.class);
       din.studentInfo();
	   
   }
}
