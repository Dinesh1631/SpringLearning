package com.myProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myProject.DTO.feedBackDTO;
import com.myProject.Services.LcMailSenderImpl;

@Controller
public class LCFeedBackController {
	@Autowired
	LcMailSenderImpl lcMailSender;
	
	@RequestMapping("/feedback")
	public String getFeedBackForm(@ModelAttribute("feedbackDto") feedBackDTO feedbackDto) {
		return "feedBackForm";
	}
	
	@RequestMapping("/feedbackSuccess")
	public String getFeedBackScuccess(@ModelAttribute("feedbackDto") feedBackDTO feedbackDto) {
		String usermail =  feedbackDto.getEmail();
		String userName = feedbackDto.getName();
		lcMailSender.feedBackMailResoponce(userName,usermail);
		return "feedBackReccived";
	}

}
