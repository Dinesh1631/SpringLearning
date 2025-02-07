package com.security.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeController {
    @ResponseBody
	@RequestMapping("/Byee")
	public String getByee() {
		return "This is Byeee";
	}
}
