package Spring.spring.crossCutFunctions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	@Before("allGetters() && allCircel()")
    public void loggingAdvice() {
    	System.out.println("This is logging Advice");
    }
//	@Before("allGetters()")
//    public void securityLogging() {
//    	System.out.println("This is security Advice");
//    }
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {}
	
	@Pointcut("within(Spring.spring.Shapes.Circel)")
	public void allCircel() {}
}
