package com.pmz.personal.portfolio.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pmz.personal.portfolio.model.forms.HomeForm;

public class HomeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return HomeForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		HomeForm homeForm = (HomeForm) obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "personalInfo",
				"personalInfo.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bio",
				"bio.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "academicInfo",
				"academicInfo.empty");
		
		if (homeForm.getPersonalInfo().length() > 500) {
			errors.rejectValue("personalInfo", "personalInfo.maxlength");
		}
		if (homeForm.getPersonalInfo().length() < 10) {
			errors.rejectValue("personalInfo", "personalInfo.minlength");
		}

		if (homeForm.getBio().length() > 1000) {
			errors.rejectValue("bio", "bio.maxlength");
		}
		if (homeForm.getBio().length() < 50) {
			errors.rejectValue("bio", "bio.minlength");
		}
		
		if (homeForm.getAcademicInfo().length() > 1000) {
			errors.rejectValue("academicInfo", "academicInfo.maxlength");
		}
		if (homeForm.getAcademicInfo().length() < 50) {
			errors.rejectValue("academicInfo", "academicInfo.minlength");
		}
		
	}

	
}
