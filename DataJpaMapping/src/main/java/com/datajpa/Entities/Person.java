//package com.datajpa.Entities;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
////@Entity
//
//public class Person {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String personName;
//	@OneToOne(cascade=CascadeType.ALL)
//	private Mobile mobile;
//	
//	public Mobile getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getPersonName() {
//		return personName;
//	}
//
//	public void setPersonName(String personName) {
//		this.personName = personName;
//	}
//
//}
