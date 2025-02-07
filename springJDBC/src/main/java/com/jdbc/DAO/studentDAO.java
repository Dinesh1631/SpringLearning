package com.jdbc.DAO;

import java.util.List;
import java.util.Map;

import com.jdbc.DTO.studentDTO;

public interface studentDAO {
        public void insert(studentDTO student);
        public void batchInsert(List<studentDTO> students);
        public List<studentDTO> findAllStudents();
        public void printAllStudents(List<studentDTO> students);
        public studentDTO getStudentWithID(int id);
        public void removeStudentWithID(int id);
        public void cleanUP();
        public List<studentDTO> findStudentByName(String name);   
        public void updateStudentAge(int id,int newAge);
        public void batchUpdate(List<studentDTO> students);
        public Map<Integer, List<String>> groupStudentByAge();
}
