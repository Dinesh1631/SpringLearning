package Spring.Annotations;

import org.springframework.stereotype.Component;

@Component
public class scinceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I teach Science Subject");

	}

}
