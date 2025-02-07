package com.SessionAttribute.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class secondController {
	@RequestMapping("/second")
	public String getFirst() {
		return "index";
	}
}
