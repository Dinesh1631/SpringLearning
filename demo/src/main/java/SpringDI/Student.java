package SpringDI;

public class Student {
    private String studentName;
    Student(String studentName){
    	this.studentName = studentName;
    	System.out.println("Student constructor invoked");
    }
    
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

	public void studentInfo() {
    	System.out.println("Student name : "+studentName);
    }
}
