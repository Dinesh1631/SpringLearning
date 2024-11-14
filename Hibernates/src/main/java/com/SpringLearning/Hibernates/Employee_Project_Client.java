package com.SpringLearning.Hibernates;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Project_Client {
	public static void main(String args[]) {
    SessionFactory factory = new Configuration().configure("configuration.xml").buildSessionFactory();
    Session session  = factory.openSession();
    Transaction txt = session.getTransaction();
    
    Employee emp = new Employee();
    emp.setE_id(1);
    emp.setE_name("Dinesh");
    
    Employee emp1 = new Employee();
    emp1.setE_id(2);
    emp1.setE_name("Raul");
    
    Project project = new Project();
    project.setP_id(11);
    project.setP_name("ChatBot");
    
    Project project1 = new Project();
    project1.setP_id(12);
    project1.setP_name("Library Management");
    
    ArrayList<Employee> empList = new ArrayList<>();
    empList.add(emp);
    empList.add(emp1);
    
    ArrayList<Project> proList = new ArrayList<>();
    proList.add(project);
    proList.add(project1);
    
    
    emp.setProject(proList);
    emp1.setProject(proList);
    
    project.setEmployee(empList);
    project1.setEmployee(empList);
    
    
    
    
    
    txt.begin();
    session.save(emp);
    session.save(emp1);
    session.save(project);
    session.save(project1);
    txt.commit();
    
    session.close();
    factory.close();
    
	}
}
