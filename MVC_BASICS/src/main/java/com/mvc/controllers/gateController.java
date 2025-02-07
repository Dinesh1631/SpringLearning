package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class gateController {
	@ResponseBody
	@RequestMapping("/father")
	public String getSugar() {
		return "This is Home";
	}
}
