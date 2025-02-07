package com.security.DAO;

public class StudentDAO {
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;

	@Override
	public String toString() {
		return "StudentDAO [userName=" + userName + ", password=" + password + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
