package com.jdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.jdbc.DTO.studentDTO;

public class studentResultSetExtractor implements ResultSetExtractor<List<studentDTO>> {

	@Override
	public List<studentDTO> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<studentDTO> studentList = new ArrayList<studentDTO>();
		while(rs.next()) {
			studentDTO student = new studentDTO();
			student.setId(rs.getInt("id"));
			student.setAge(rs.getInt("age"));
			student.setName(rs.getString("name"));
			studentList.add(student);
		}
		System.out.println("studentResultSetExtractor has been called");
		return studentList;
	}

}
