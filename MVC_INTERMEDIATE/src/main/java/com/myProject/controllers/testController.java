package com.myProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	//@ResponseBody()
	@RequestMapping("/sugar")
	public String getSugar() {
		return "sugar";
	}
	
	@ResponseBody()
	@RequestMapping("/bat")
	public String getBat() {
		return "This is Bat";
	}
}
