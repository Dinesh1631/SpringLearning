package Spring.spring.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Spring.spring.entities.student;
@Component("studentDao")
public class studentDaoImplementation implements studentDao {
	@Autowired()
   private JdbcTemplate jdbcTemplete;
	@Override
	public int insert(student student) {
		String sql = "insert into students (studentId,studentName,studentAge,studentCity) values(?,?,?,?)";
		int result = jdbcTemplete.update(sql,student.getStudentId(),student.getStudentName(),student.getStudentAge(),student.getStudentCity());
		return result;
		
	}
	@Override
	public int update(student student) {
		String sql = "update students set studentName=?,studentAge=? where studentId=?";
		int result = jdbcTemplete.update(sql,student.getStudentName(),student.getStudentAge(),student.getStudentId());
		return result;
	}
	@Override
	public int Delete(student student) {
		String sql = "delete from students where studentId=?";
		int result = jdbcTemplete.update(sql,student.getStudentId());
		return result;
	}
	@Override
	public student retrive(int studentId) {
		String sql = "select * from students where studentId=?";
		RowMapper<student> rowMapper = new rowMapperImplementation();
		student stu = jdbcTemplete.queryForObject(sql,rowMapper,studentId);
		return stu;
	}
	@Override
	public List<student> retriveAll() {
		
		String sql = "select * from students";
		RowMapper<student> rowMapper = new rowMapperImplementation();
		List<student> stu = jdbcTemplete.query(sql,rowMapper);
		return stu;
	}

}
