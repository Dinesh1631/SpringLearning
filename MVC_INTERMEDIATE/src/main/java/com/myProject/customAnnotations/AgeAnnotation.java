package com.myProject.customAnnotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.myProject.Validators.AgeValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { AgeValidator.class })
public @interface AgeAnnotation {
	String message() default "Age should be between {lower} and {higher}";
	
	int lower() default 18;
	
	int higher() default 60;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
