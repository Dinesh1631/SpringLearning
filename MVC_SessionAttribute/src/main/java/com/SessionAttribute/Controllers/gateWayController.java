package com.SessionAttribute.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class gateWayController {

	@RequestMapping("/first")
	public String getFirst() {
		return "index";
	}
}
