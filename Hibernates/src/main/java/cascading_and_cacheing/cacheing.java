package cascading_and_cacheing;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class cacheing {
	public static void main(String[] args) {
		
		 
		SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction txt = session.getTransaction();
		
		student stu = new student();
		stu.setId(3);
		stu.setName("Swift");
		txt.begin();
		
		session.save(stu);
		
		txt.commit();
		session.close();
		
		System.out.println("session1 opened");
		Session session1 = factory.openSession();
		student stu1 = session1.get(student.class, 2);
		System.out.println(stu1);
		session1.close();
		System.out.println("session1 closed");
		
		System.out.println("session2 opened");
		Session session2 = factory.openSession();
		student stu2 = session2.get(student.class, 2);
		System.out.println(stu2);
		System.out.println("session2 closed");
		session2.close();
		factory.close();

	}
}


