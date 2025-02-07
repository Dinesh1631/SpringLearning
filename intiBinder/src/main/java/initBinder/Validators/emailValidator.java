package initBinder.Validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import initBinder.DTO.studentDTO;

public class emailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return studentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		String email = ((studentDTO) target).getEmail();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty", "email field can't be empty");
		if (email!=null && email.contains("@")) {
			String domain = email.split("@")[1];
			if (domain.equalsIgnoreCase("gmail.com")) {
			} else {
				errors.rejectValue("email", "email.invalid", "invalid email domain");
			}
		} else {
			errors.rejectValue("email", "email.invalid", "email should contain @ charcter");
		}

	}

}
