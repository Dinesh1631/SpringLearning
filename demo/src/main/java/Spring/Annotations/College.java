package Spring.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${College.name}")
	private String collegeName;
	@Autowired
	@Qualifier("scinceTeacher")
	private Teacher teacher;
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	public void print() {
   	 System.out.println("This is college class");
   	 System.out.println("The college name is :" + collegeName);
    } 
	
	public void techerInfo() {
		teacher.teach();
	}
}
