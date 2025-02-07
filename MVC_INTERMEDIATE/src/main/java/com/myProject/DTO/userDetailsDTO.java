package com.myProject.DTO;

import com.myProject.customAnnotations.AgeAnnotation;

@SuppressWarnings("unused")
public class userDetailsDTO {
	private String name;
	private String userName;
	private String password;
	private String country;
	private String[] hobbies;
	private String gender;
	private CommunicationDto communicationDto;
	private BillDTO billdto;
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BillDTO getBilldto() {
		return billdto;
	}

	public void setBilldto(BillDTO billdto) {
		this.billdto = billdto;
	}

	public CommunicationDto getCommunicationDto() {
		return communicationDto;
	}

	public void setCommunicationDto(CommunicationDto communicationDto) {
		this.communicationDto = communicationDto;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
