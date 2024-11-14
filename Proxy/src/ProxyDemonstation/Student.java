package ProxyDemonstation;
public class Student implements DialySession{
    Attendence attendence;

	public Student(Attendence attendence) {
		this.attendence=attendence;
	}
	
	public void studentAttendence() {
		System.out.println("Student has attended lecture");
	}
	
}
