package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SuppressWarnings("unused")
@Controller
public class mother {
	//@ResponseBody
	@RequestMapping("/mom")
	public String getSugar() {
		return "sugar";
	}
}
