package Spring.spring.entities;

import org.springframework.stereotype.Component;


public class student {
     private int studentId;
     private String studentName;
     private int studentAge;
     private String studentCity;
//	public student() {	}
//	public student(int studentId, String studentName, int studentAge, String studentCity) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentAge = studentAge;
//		this.studentCity = studentCity;
//	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String string) {
		this.studentName = string;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentCity=" + studentCity + "]";
	}
	
}
