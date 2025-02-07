package com.security.contollers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HiController {
	@Autowired
	JdbcUserDetailsManager jdbcDetailManager;
	@ResponseBody
	@RequestMapping("/Hi")
	public String getHi() {
		return "This is Hii!";
	}

	@ResponseBody
	@RequestMapping("/Hello")
	public String getHello() {
		return "This is Hello!";
	}
	
	
	@RequestMapping("/deleteUser")
	public String deleteUser(Model model ,Principal pricipal) {
		String userName = pricipal.getName();
	    model.addAttribute("userName", userName);
		return "DeleteUser";
	}
	
	@RequestMapping("/deleteUserProcessing")
	public String deleteUserProcess(@RequestParam("userName")String userName) {
		jdbcDetailManager.deleteUser(userName);
		System.out.println("user deleted");
		return "DeleteUserProcess";
	}
}
