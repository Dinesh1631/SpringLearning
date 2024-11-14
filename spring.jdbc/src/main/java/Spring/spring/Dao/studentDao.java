package Spring.spring.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import Spring.spring.entities.student;

public interface studentDao {
      public int insert(student student);
      public int update(student student);
      public int Delete(student student);
      public student retrive(int studentId);
      public List<student> retriveAll();
}
