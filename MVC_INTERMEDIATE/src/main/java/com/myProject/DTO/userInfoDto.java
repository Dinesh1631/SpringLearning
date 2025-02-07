package com.myProject.DTO;

public class userInfoDto {
	@jakarta.validation.constraints.NotBlank(message = "This filed connot be Empty")
	private String userName;
	private String crushName;
	@jakarta.validation.constraints.AssertTrue(message = "must check the terms and conditions")
	private boolean TermsAndConditions;
	private String email;
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTermsAndConditions() {
		return TermsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		TermsAndConditions = termsAndConditions;
	}

	@Override
	public String toString() {
		return "userInfoDto [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
}
