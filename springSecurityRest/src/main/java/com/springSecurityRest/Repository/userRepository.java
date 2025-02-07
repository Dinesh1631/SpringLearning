package com.springSecurityRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecurityRest.Modal.user;

public interface userRepository extends JpaRepository<user,Integer>{

	
	user findByusername(String username);

}
