package initBinder.Controllers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import initBinder.DTO.studentDTO;
import initBinder.Validators.emailValidator;
import initBinder.Validators.userNameValidator;
import jakarta.validation.Valid;

@Controller
public class gateWayController {
	@Autowired
	private userNameValidator nameValidator;

	@ResponseBody
	@RequestMapping("/sugar")
	public String getSuagr() {
		return "This is Sugar";
	}

	@RequestMapping("/register")
	public String getRegistrationPage(@ModelAttribute("studentInfo") studentDTO dto) {

		return "RegistrationPage";
	}

	@RequestMapping("/process")
	public String getProcessingPage(@Valid @ModelAttribute("studentInfo") studentDTO dto, BindingResult result) {
		nameValidator.validate(dto, result);
		if (result.hasErrors()) {
			return "RegistrationPage";
		}
		return "ProcessingPage";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
//    	StringTrimmerEditor editor = new StringTrimmerEditor(false);
//    	binder.registerCustomEditor(String.class, "userName", editor);

		// Creating Date property editor.
		SimpleDateFormat fromat = new SimpleDateFormat("dd-MM-yy");
		CustomDateEditor dateEditor = new CustomDateEditor(fromat, true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);

		// Creating Number property editor.
		NumberFormat numberFormat = new DecimalFormat("##,##,###.00");
		CustomNumberEditor numberEditor = new CustomNumberEditor(Integer.class, numberFormat, true);
		binder.registerCustomEditor(Integer.class, "salary", numberEditor);

		// creating a custom name editor
//        namePropertyEditor nameEditor = new namePropertyEditor();
//        binder.registerCustomEditor(String.class,"userName",nameEditor);
//        binder.registerCustomEditor(String.class,"password",nameEditor);

		// creating a custom currencyEditor.
//        currencyPropertyEditor currencyEditor = new currencyPropertyEditor();
//        binder.registerCustomEditor(Currency.class,"currency", currencyEditor);

		// Registering customValidatoers using Spring MVC Validators.
		// custom userName Validator.
//        userNameValidator nameValidator = new userNameValidator();
//        binder.addValidators(nameValidator);
//        
		// custom email Validator
		emailValidator emailvalid = new emailValidator();
		binder.addValidators(emailvalid);
	}

}
