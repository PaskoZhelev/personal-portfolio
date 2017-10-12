package com.pmz.personal.portfolio.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pmz.personal.portfolio.service.InformationPropertiesService;

@Service
public class InformationPropertiesServiceImpl implements InformationPropertiesService{

	@Value("${information.personal.info}")
	private String personalInfo;
	@Value("${information.biography}")
	private String biography;
	@Value("${information.academic.info}")
	private String academicInfo;
	
	public String getPersonalInfo() {
		return personalInfo;
	}
	public String getBiography() {
		return biography;
	}
	public String getAcademicInfo() {
		return academicInfo;
	}
	
	
}
