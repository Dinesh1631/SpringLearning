package Hibernate_Creteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class vechile_client {
	public static void main(String args[]) {
      SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
      Session session = factory.openSession();
     
      
//      veh.setId(2);
//      veh.setName("Car");
//      
//      Transaction txt = session.getTransaction();
//      
//      txt.begin();
//      session.save(veh);
//      txt.commit();
      
      @SuppressWarnings("deprecation")
	Criteria v = session.createCriteria(vechile.class);
      @SuppressWarnings("unchecked")
	List<vechile> list = v.list();
       
     for(vechile i : list) System.out.println(i.getId()+ "  "+ i.getName()); 
      
	}
}
