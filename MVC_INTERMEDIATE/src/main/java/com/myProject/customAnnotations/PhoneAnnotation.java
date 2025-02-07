package com.myProject.customAnnotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.myProject.Validators.phoneValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { phoneValidator.class })
public @interface PhoneAnnotation {
	String message() default "Enter valid phone number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
