package loadingFromPropertyFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
     public static void main(String args[])
     {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("ValueReqAnno.xml");
    	 System.out.println("config file Loaded");
    	 Student student = context.getBean("student",Student.class);
    	 student.diaplayStudentInfo();
     }
}
