package Spring.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring.spring.Dao.jdbcConfiguration;
import Spring.spring.Dao.studentDao;
import Spring.spring.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfiguration.class);
        System.out.println("Config file is loaded");
        studentDao  studentdao = context.getBean("studentDao",studentDao.class);
        student stu = new student();
/*        
 *  ----------------------------Insert Part-------------------------------
        stu.setStudentId(9);
        stu.setStudentName("Ravi Kiran");
        stu.setStudentAge(24);
        stu.setStudentCity("Patwarigudem");
        int result = studentdao.insert(stu);
        System.out.println(result +" student is inserted");  */
        
        
   /*   ------------------------Update Part---------------------------------
    *   stu.setStudentId(9);
        stu.setStudentName("Keyush");
        stu.setStudentAge(6);
        int update = studentdao.update(stu);
        System.out.println(update +" Rows has updated");    */
        
   /* -------------------------Delete Part-----------------------------------   
        stu.setStudentId(9);
        int delete = studentdao.Delete(stu);
        System.out.println(delete +" : rows has deleted");  */
        
 /*   ------------------------Retiving one student Info----------------------  
  *   stu = studentdao.retrive(2);
      System.out.println(stu);
      -----------------------Retriving all studentInfo------------------------
      List<student> arr = studentdao.retriveAll();
      for(student stnt: arr) System.out.println(stnt);
      */
        List<student> arr = studentdao.retriveAll();
        for(student stnt: arr) System.out.println(stnt);
        
        context.close();
    }
}
