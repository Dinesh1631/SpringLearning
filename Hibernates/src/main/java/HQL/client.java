package HQL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@SuppressWarnings("unused")
public class client {
public static void main(String args[])
{
	  SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
      Session session = factory.openSession();
      Transaction txt = session.getTransaction();
      
      student stu  = new student();
      stu.setId(1);
      stu.setName("Dinesh");
      stu.setAge(22);
      stu.setCity("Hyderabad");
      
      student stu1  = new student();
      stu1.setId(2);
      stu1.setName("Raul");
      stu1.setAge(23);
      stu1.setCity("Madrid");
      
      student stu2  = new student();
      stu2.setId(3);
      stu2.setName("xavi");
      stu2.setAge(24);
      stu2.setCity("Barcelona");
      
      //Saving object into data bases.
      txt.begin();
      session.save(stu);
      session.save(stu1);
      session.save(stu2);
      txt.commit();
      
      //Fetching data from table
      String query = "from student where City='Madrid' or City='Hyderabad'";
      
      @SuppressWarnings("rawtypes")
	Query q = session.createQuery(query);
      
      @SuppressWarnings("unchecked")
	List <student>arr = q.list();
      
      for(student s : arr) System.out.println(s.toString());
      
      
      
      //Performing delete and update operations on the data base.
      Transaction txt1 = session.getTransaction();
      txt1.begin();
      //Delete:
     @SuppressWarnings("rawtypes")
	Query query1 = session.createQuery("delete from student where city= :c");
//     query1.setParameter("c", "Hyderabad");
//     
//     int rs = query1.executeUpdate();
//     
//     System.out.println("No of rows deleted :"+rs);
     //Update:
     query1 = session.createQuery("update student set name=:n where city=:c");
     query1.setParameter("n","Ramos");
     query1.setParameter("c","Madrid");
     int rs = query1.executeUpdate();
     System.out.println("No of rows updated : "+rs); 
      txt1.commit();
      
     //Pagenation:
      
      @SuppressWarnings("rawtypes")
	Query page = session.createQuery("from student");
      page.setFirstResult(0);
      page.setMaxResults(2);
      
      @SuppressWarnings("unchecked")
	List<student> stuList = page.list();
      
      for(student obj : stuList) System.out.println(obj.toString());
      
      
      
      
      session.close();
      factory.close();
}
}
