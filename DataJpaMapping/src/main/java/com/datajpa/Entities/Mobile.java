//package com.datajpa.Entities;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
////@Entity
//public class Mobile {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String mobileName;
//	@OneToOne(mappedBy="mobile")
//	private Person person;
//
//	public Person getPerson() {
//		return person;
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//
//	public String getMobileName() {
//		return mobileName;
//	}
//
//	public void setMobileName(String mobileName) {
//		this.mobileName = mobileName;
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
//}
