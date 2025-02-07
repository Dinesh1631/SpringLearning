package com.myProject.Validators;

import com.myProject.customAnnotations.AgeAnnotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<AgeAnnotation, Integer> {
	private int lower;
	private int higher;

	@Override
	public void initialize(AgeAnnotation age) {
		this.lower = age.lower();
		this.higher = age.higher();

	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if (value > lower && value < higher)
			return true;
		return false;
	}

}
