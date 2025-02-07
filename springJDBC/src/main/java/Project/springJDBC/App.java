package Project.springJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.Configuration.webAppConfiguration;
import com.jdbc.DAO.studentDAO;
import com.jdbc.DAO.studentDAOImpl;
import com.jdbc.DTO.studentDTO;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
        System.out.println("Hello World!");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(webAppConfiguration.class);
        System.out.println("context loaded");
        studentDAO dao = context.getBean(studentDAOImpl.class);
        
        //Creating new Student:
        List<studentDTO> studentList = new ArrayList<>();

        studentDTO student1 = new studentDTO();
        student1.setId(1);
        student1.setName("Guddu Pandit");
        student1.setAge(20);  // Same age for the first group
        studentList.add(student1);

        studentDTO student2 = new studentDTO();
        student2.setId(2);
        student2.setName("Amit Kumar");
        student2.setAge(20);  // Same age for the first group
        studentList.add(student2);

        studentDTO student3 = new studentDTO();
        student3.setId(3);
        student3.setName("Neha Sharma");
        student3.setAge(20);  // Same age for the first group
        studentList.add(student3);

        studentDTO student4 = new studentDTO();
        student4.setId(4);
        student4.setName("Rajesh Singh");
        student4.setAge(22);  // Different age for the second group
        studentList.add(student4);

        studentDTO student5 = new studentDTO();
        student5.setId(5);
        student5.setName("Priya Yadav");
        student5.setAge(22);  // Different age for the second group
        studentList.add(student5);

        studentDTO student6 = new studentDTO();
        student6.setId(6);
        student6.setName("Anjali Verma");
        student6.setAge(22);  // Different age for the second group
        studentList.add(student6);

        
        //Single student insertion
        //dao.insert(student1);
        
        //Batch of Student Insertion:
        //dao.batchInsert(studentList);
        
        
        //selecting all the students and printing them:
        //List<studentDTO> stuList = dao.findAllStudents();
        //dao.printAllStudents(stuList);
        
        //Selection student with Sepecific condition:
        //studentDTO student = dao.getStudentWithID(5);
        //System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
        
        //Deleteing student with specific ID:
        //dao.removeStudentWithID(1);
        
        //cleanUp the entire table:
         //dao.cleanUP();
        
        //Finding Student by name:
        //List<studentDTO> stuList = dao.findStudentByName("Guddu Pandit");
        //dao.printAllStudents(stuList);
        
        //Updating person age based on id:
        //dao.updateStudentAge(6, 25);
        
        //Doing Batch update to DB
        //dao.batchUpdate(studentList);
        
        //Getting students groupedBy Age:
        Map<Integer, List<String>> map  = dao.groupStudentByAge();
        
        for(Map.Entry<Integer, List<String> >entry : map.entrySet() ) {
        	System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        context.close();
    }
}
