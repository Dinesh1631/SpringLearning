//package com.security.Services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.security.DAO.StudentDAO;
//
//@Service
//public class studentDAODetailManagerImpl implements UserDetailsService {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		System.out.println("Inside the custom implemetation ");
////		String sql = "SELECT * FROM dineshdb.student where userName= ? ";
////		StudentDAO StudentDAO = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(StudentDAO.class),username);
////		UserDetails newUser = User.withUsername(StudentDAO.getUserName()).password(StudentDAO.getPassword()).build();
////		System.out.println(StudentDAO.toString());
////		return newUser;
////	}
//
//}
