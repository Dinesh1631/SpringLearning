package com.springSecurityRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurityRest.Modal.user;
import com.springSecurityRest.Repository.userRepository;
import com.springSecurityRest.Service.userService;
import com.springSecurityRest.Service.userserviceImpl;

@RestController
public class gateWayController {
	@Autowired
	userRepository userrepo;
	@Autowired
	PasswordEncoder encoder; // Ensure the PasswordEncoder is autowired
	@Autowired
	userserviceImpl userservice;

	@GetMapping("/")
	public ResponseEntity<?> LandingPage() {
		return new ResponseEntity<>("Hi Hello", HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		List<user> userList = userrepo.findAll();
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<?> RegistrationController(@RequestBody user usr) {
		String encodedPassword = encoder.encode(usr.getPassword());
		usr.setPassword(encodedPassword);
		userrepo.save(usr);
		return new ResponseEntity<>("User registration is successful", HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<?> LoginController(@RequestBody user usr) {
		System.out.println("Inside login controller");
		String token = null;
		try {
			token = userservice.login(usr);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (token == null) {
			return new ResponseEntity<>("Bad credintials", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(token, HttpStatus.OK);
		}

	}
}
