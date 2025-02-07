package com.myProject.DTO;

import com.myProject.customAnnotations.PhoneAnnotation;

public class CommunicationDto {
	private String email;
	@PhoneAnnotation()
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
