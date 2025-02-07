package com.myProject.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myProject.DTO.Phone;

public class phoneNumberFormatter implements Formatter<Phone>{

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phone = new Phone();
		String defaultCountryCode = "91";
		if(text.contains("-")) {
			String[] number = text.split("-");
			String countryCode = number[0];
			if(countryCode.equalsIgnoreCase("")) {
				countryCode=defaultCountryCode;
			}
			String phoneNumber = number[1];
			phone.setCountryCode(countryCode);
			phone.setPhoneNumber(phoneNumber);
		}
		else {
			phone.setCountryCode(defaultCountryCode);
			phone.setPhoneNumber(text);
		}
		
		return phone;
	}

	@Override
	public String print(Phone object, Locale locale) {
		
		return object.getCountryCode()+"-"+object.getPhoneNumber();
	}

}
