package com.SpringLearning.Hibernates;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        Question question = new Question();
        question.setQ_id(1);
        question.setQ_name("What is life?");
        
//        Question question1 = new Question();
//        question1.setQ_id(2);
//        question1.setQ_name("What is purpose of life?");
         
        
//        Answer answer = new Answer();
//        answer.setA_id(11);
//        answer.setA_name("Life is Pain");
//        answer.setQuestion(question);
//        
//        Answer answer1 = new Answer();
//        answer1.setA_id(22);
//        answer1.setA_name("To suffer and strive for greatness");
//        answer1.setQuestion(question);
//        //List for storing all answers
//        List<Answer> ans = new ArrayList<>();
////        ans.add(answer);
////        ans.add(answer1);
//        //setting answer in question table.
//        question.setAnswer(ans);
        //question1.setAnswer(answer1);
        
        //setting questions in answer tabel
        
        //answer.setQuestion(question);
       // answer1.setQuestion(question1);
        
        
        Transaction txt = session.getTransaction();
        txt.begin();
        session.save(question);
        //session.save(question1);
//        session.save(answer);
//        session.save(answer1);
        txt.commit();
        //This fetching the data from table.
//        Question data = session.get(Question.class,1);
//        System.out.println("The Question is : " + data.getQ_name());
//        System.out.println("The answer is : "+data.getAnswer().getA_name());
        
        
        @SuppressWarnings("deprecation")
		Criteria qus = session.createCriteria(Question.class);
        @SuppressWarnings("unchecked")
		List<Question> list = qus.list();
        
        System.out.println(list.toString());
        
        session.close();
        factory.close();
    }
}

