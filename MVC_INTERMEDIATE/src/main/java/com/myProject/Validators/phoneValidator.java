package com.myProject.Validators;

import com.myProject.DTO.Phone;
import com.myProject.customAnnotations.PhoneAnnotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class phoneValidator implements ConstraintValidator<PhoneAnnotation,Phone> {

	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext context) {
		System.out.println("Inside isValid");
		
		@SuppressWarnings("unused")
		String countryCode = phone.getCountryCode();
//		String number = phone.getPhoneNumber();
		 String number1 = phone.getPhoneNumber(); 
	        if (number1 == null) {
	            return false; 
	        }
		System.out.println("Inside is isValid Method");
		if(number1.length()==10 && number1.matches("[0-9-]+")) {
			return true;
		}
		return false;
	}

}
