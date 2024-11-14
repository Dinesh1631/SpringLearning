package cascading_and_cacheing;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class cascading {
	public static void main(String[] args) {
      SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
      Session session = factory.openSession();
      Question question = new Question();
      question.setQ_id(1);
      question.setQ_name("What is life");
      
      Answer answer = new Answer();
      answer.setA_id(1);
      answer.setA_name("Life is Pain");
      answer.setQuestion(question);
      
      Answer answer1 = new Answer();
      answer1.setA_id(2);
      answer1.setA_name("Life is sufferring");
      answer1.setQuestion(question);
      
      List<Answer> ansList = new ArrayList<>();
      ansList.add(answer);
      ansList.add(answer1);
      question.setAnswer(ansList);
      
      Transaction txt = session.getTransaction();
      
      txt.begin();
      
      session.save(question);
      
      txt.commit();
      
      
      
      
      session.close();
      factory.close();
      
	}
}
