package com.jdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.DTO.studentDTO;

public class studentRowMapper implements RowMapper< studentDTO> {

	@Override
	public studentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		studentDTO student = new studentDTO();
		student.setId(rs.getInt("id"));
		student.setAge(rs.getInt("age"));
		student.setName(rs.getString("name"));
		System.out.println("Student row Mapper called");
		return student;
	}

}
