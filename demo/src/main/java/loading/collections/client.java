package loading.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
 public static void main(String args[])
 {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
	student stu = context.getBean("student",student.class);
	String ans = stu.toString();
	System.out.println(ans);
	context.close();
 }
}
