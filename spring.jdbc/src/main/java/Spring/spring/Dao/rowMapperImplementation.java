package Spring.spring.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Spring.spring.entities.student;

public class rowMapperImplementation implements RowMapper<student>{
	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student stu = new student();
		stu.setStudentId(rs.getInt(1));
		stu.setStudentName(rs.getString(2));
		stu.setStudentAge(rs.getInt(3));
		stu.setStudentCity(rs.getString(4));	
		return stu;
	}

}
