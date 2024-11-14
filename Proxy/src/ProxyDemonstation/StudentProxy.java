package ProxyDemonstation;

public class StudentProxy extends Student{

	public StudentProxy(Attendence attendence) {
		super(attendence);
	}
	
	public void studentAttendence() {
		if(attendence.isPresent())
		  super.studentAttendence();
		else
			System.out.println("Student has not attended class");
	}
}
