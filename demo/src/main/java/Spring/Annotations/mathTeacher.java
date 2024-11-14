package Spring.Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class mathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("MathTeacher class Loaded");
		System.out.println("I teach Math Subject");

	}

}
