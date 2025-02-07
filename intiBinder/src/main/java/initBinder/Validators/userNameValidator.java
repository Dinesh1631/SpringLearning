package initBinder.Validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import initBinder.DTO.studentDTO;
@Component
public class userNameValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return studentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty");
		String userName = ((studentDTO)target).getUserName();
		if(userName!= null && !userName.contains("-")) {
			errors.rejectValue("userName","userName.invalid");
		}
	}

	private String studentDTO(Object target) {
		// TODO Auto-generated method stub
		return null;
	}

}
