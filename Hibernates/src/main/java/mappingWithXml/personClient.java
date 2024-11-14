package mappingWithXml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class personClient {
	public static void main(String args[]) {
	SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
	Session session = factory.openSession();
	Transaction txt = session.getTransaction();
	
	person per = new person();
	per.setId(1);
	per.setName("Walter White");
	
	txt.begin();
	
	session.save(per);
	
	txt.commit();
	
	session.close();
	factory.close();
	}
}
