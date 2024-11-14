package loadingFromPropertyFile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	 
      private String name;
      private String intrestedCourse;
      private String hobby;
      
      @Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
     
      @Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
      
      @Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
		}
      
    public void diaplayStudentInfo() {
    	System.out.println("Student Name :" + name);
    	System.out.println("Intested course :"+intrestedCourse);
    	System.out.println("Hobby is :"+hobby);
    }
}
