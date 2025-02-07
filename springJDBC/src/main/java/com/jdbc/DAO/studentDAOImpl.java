package com.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.DTO.studentDTO;

@Repository
public class studentDAOImpl implements studentDAO {

	@Autowired
	JdbcTemplate template;

	@Override
	public void insert(studentDTO student) {
		String sql = "INSERT INTO person VALUES(?, ?, ?)";
		Object[] args = { student.getId(), student.getAge(), student.getName() };
		template.update(sql, args);
		System.out.println("One row Inserted");

	}

	@Override
	public void batchInsert(List<studentDTO> students) {
		String sql = "INSERT INTO person VALUES(?, ?, ?)";
		List<Object[]> argsList = new ArrayList<>();

		for (studentDTO student : students) {
			Object[] args = { student.getId(), student.getAge(), student.getName() };
			argsList.add(args);
		}

		template.batchUpdate(sql, argsList);
		System.out.println("Batch Insertion Done");
	}

	@Override
	public List<studentDTO> findAllStudents() {
		String sql = "SELECT * FROM dineshdb.person;";
		List<studentDTO> studentList = template.query(sql, new studentRowMapper());
		System.out.println("Extracted all the students");
		return studentList;
	}

	@Override
	public void printAllStudents(List<studentDTO> students) {
		for (studentDTO student : students) {
			System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
		}
		System.out.println("This is the list of students");

	}

	@Override
	public studentDTO getStudentWithID(int id) {
		String sql = "SELECT * FROM dineshdb.person where id = ?";
		int args = id;
		studentDTO student = template.queryForObject(sql, new studentRowMapper(), args);
		return student;

	}

	@Override
	public void removeStudentWithID(int id) {
		String sql = "delete from dineshdb.person where id = ? ";
		int args = id;
		template.update(sql, args);
		System.out.println("Person with given Id deleted from DB");
	}

	@Override
	public void cleanUP() {
		String sql = "TRUNCATE TABLE dineshdb.person";
		template.execute(sql);
		System.out.println("DB cleaning was done");
	}

	@Override
	public List<studentDTO> findStudentByName(String name) {
		String sql = "select * from dineshdb.person where name = ?";
		Object args = name;
		List<studentDTO> students = template.query(sql, new studentResultSetExtractor(), name);
		return students;
	}

	@Override
	public void updateStudentAge(int id, int newAge) {
		String sql = "UPDATE dineshdb.person SET age = ? WHERE id = ?";
		Object[] args = { newAge, id };
		template.update(sql, args);
		System.out.println("Person age is update to newAge");
	}

	@Override
	public void batchUpdate(List<studentDTO> students) {
		String sql = "UPDATE dineshdb.person SET name = ? WHERE id = ?";
		template.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				/* 1:is index of '?' in prepared Statement */
				ps.setString(1, students.get(i).getName());
				ps.setInt(2, students.get(i).getId());
			}

			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return students.size();
			}
		});

		System.out.println("BatchUpadate was done to db");
	}

	@Override
	public Map<Integer, List<String>> groupStudentByAge() {
		Map<Integer, List<String>> map = new HashMap<>();
		
		String sql = "SELECT * FROM dineshdb.person";
		List<studentDTO> students = template.query(sql, new studentResultSetExtractor());
		for (studentDTO student : students) {
			if (map.get(student.getAge()) != null) {
				map.get(student.getAge()).add(student.getName());
			}else {
			ArrayList<String> list = new ArrayList<>();
			list.add(student.getName());
			map.put(student.getAge(), list);
			}
		}
		System.out.println("All the students are grouped by there age");
		return map;
	}

}
