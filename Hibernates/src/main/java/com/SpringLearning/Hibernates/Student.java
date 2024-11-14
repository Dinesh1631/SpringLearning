package com.SpringLearning.Hibernates;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity()
public class Student {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id ;
   private String name;
   private String address;
   private boolean isPresent;
   @Temporal(value = TemporalType.DATE)
   private Date dob;
   private double fee;
   @Embedded()
   private Certificate certi;
   
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", isPresent=" + isPresent + ", dob=" + dob
			+ ", fee=" + fee + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public boolean isPresent() {
	return isPresent;
}
public void setPresent(boolean isPresent) {
	this.isPresent = isPresent;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public Certificate getCerti() {
	return certi;
}
public void setCerti(Certificate certi) {
	this.certi = certi;
}

}
