package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class son {
	@ResponseBody
	@RequestMapping("/son")
	public String getSugar() {
		return "This is bat";
	}
}
