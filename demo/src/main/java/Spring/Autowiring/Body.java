package Spring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {
	 @Autowired
	 @Qualifier("whaleHeartObject")
    private Heart heart;
   
   
//    @Autowired
//    @Qualifier("whaleHeartObject")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter method is called");
//	}
	
    public void checkAlive() {
    	if(heart!=null) {
    		heart.pump();
    	}
    	else System.out.println("Your are dead");
    }
	
}
