package com.pmz.personal.portfolio.model.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HomeForm {
	
	@NotNull(message= "{personal.info.notnull}")
	@Size(min=10, max=300, message= "{personal.info.size}")
	private String personalInfo;
	
	@NotNull(message= "{bio.notnull}")
	@Size(min=50, max=2000, message= "{bio.size}")
	private String bio;
	
	@NotNull(message= "{academic.info.notnull}")
	@Size(min=50, max=1000, message= "{academic.info.size}")
	private String academicInfo;
	
	public HomeForm() { }

	public String getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getAcademicInfo() {
		return academicInfo;
	}

	public void setAcademicInfo(String academicInfo) {
		this.academicInfo = academicInfo;
	}
	
	
}
