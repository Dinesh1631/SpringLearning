//package com.datajpa.Entities;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Student {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String studentName;
//	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
//	private List<Address> adress;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public List<Address> getAdress() {
//		return adress;
//	}
//
//	public void setAdress(List<Address> adress) {
//		this.adress = adress;
//	}
//
//}
