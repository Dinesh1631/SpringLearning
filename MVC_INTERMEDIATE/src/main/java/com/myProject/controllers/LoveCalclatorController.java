package com.myProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myProject.DTO.CommunicationDto;
import com.myProject.DTO.Phone;
import com.myProject.DTO.userDetailsDTO;
import com.myProject.DTO.userInfoDto;
import com.myProject.Services.LcMailSender;
import com.myProject.Services.LcMailSenderImpl;
import com.myProject.Services.resultCalculationServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@SuppressWarnings("unused")
@Controller
public class LoveCalclatorController {

	@Autowired
	private LcMailSenderImpl lcMailSenderImpl;
	@Autowired(required = true)
	private resultCalculationServiceImpl resultCalculation;

	@RequestMapping("/LandingPage")
	public String getLandingPage(@ModelAttribute("userInfo") userInfoDto userInfo, HttpSession session) {
		// with cookies
		// userInfo.setUserName(userName);

		// with session
		String sessionUserName = (String) session.getAttribute("userInfo");
		userInfo.setUserName(sessionUserName);
		return "LandingPage";

	}

	@RequestMapping("/ProcessingPage")
	public String getProcessingPage(@jakarta.validation.Valid @ModelAttribute("userInfo") userInfoDto userInfo,
			BindingResult result, HttpServletRequest request) {

//		// Creating Cookie to store userName
//		Cookie userCookie = new Cookie("userName", userInfo.getUserName());
//		// Adding it to responce to send across pages.
//		responce.addCookie(userCookie);

		// Working with Session:
		HttpSession session = request.getSession();
		session.setAttribute("userName", userInfo.getUserName());
		session.setAttribute("crushName", userInfo.getCrushName());
		if (result.hasErrors()) {
			return "LandingPage";
		}
		String relation = resultCalculation.resultCalculate(userInfo.getUserName(), userInfo.getCrushName());
		userInfo.setResult(relation);
		session.setAttribute("result", relation);
		return "ProcessingPage";

	}

	@RequestMapping("/emailPage")
	public String getemailPage(@ModelAttribute("userInfo") userInfoDto userInfo,
			@CookieValue("userName") String userName, HttpSession session) {
		String sessionUserName = (String) session.getAttribute("userName");
		userInfo.setUserName(sessionUserName);
		return "emailPage";

	}

	@RequestMapping("/emailSuccessPage")
	public String getemailSuccessPage(@ModelAttribute("userInfo") userInfoDto userInfo,
			@CookieValue("userName") String userName, HttpSession session) throws Exception {
		// with Cookies
		// userInfo.setUserName(userName);

		// With sessions
		String sessionuserName = (String) session.getAttribute("userName");
		String crushName = (String) session.getAttribute("crushName");
		userInfo.setUserName(sessionuserName);
		String result = (String) session.getAttribute("result");
		lcMailSenderImpl.sendMail(userInfo.getEmail(), result, sessionuserName, crushName);

		return "emailSuccessPage";

	}

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//
//		// custom email Validator
//		emailValidator emailvalid = new emailValidator();
//		binder.addValidators(emailvalid);
//	}

	@RequestMapping("/Register")
	public String getRegistrationPage(@ModelAttribute("userInfo") userDetailsDTO userDTO) {
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNumber("1234567890");

		CommunicationDto Comdto = new CommunicationDto();
		Comdto.setPhone(phone);

		userDTO.setCommunicationDto(Comdto);

		return "Registartion";
	}

	@RequestMapping("/Success")
	public String getSuccessPage(@Valid @ModelAttribute("userInfo") userDetailsDTO userDTO,
			@Valid @ModelAttribute("communicationInfo") CommunicationDto comDto, BindingResult result) {
		System.out.println("Inside getSuccess");
		if (result.hasErrors()) {
			System.out.println("Inside results page");
			return "Registartion";
		}
		return "RegistrationSuccess";
	}
}
