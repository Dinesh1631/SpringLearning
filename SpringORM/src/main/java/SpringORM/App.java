package SpringORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.Student;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringORM/config.xml");
		SessionFactory factory = (SessionFactory) context.getBean("factory");
		Session session = factory.openSession();
		Transaction txt = session.getTransaction();
		Student student = new Student();
		student.setStudentName("Dinesh");

		txt.begin();

		session.save(student);

		txt.commit();
		System.out.println("Saved Successfully");
	}
}
