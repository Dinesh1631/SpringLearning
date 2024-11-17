package SpringIOC;

public class Airtel implements Sim{
	
//	Airtel(){
//		System.out.println("Airtel Constructor is loaded");
//	}

	@Override
	public void calling() {
		System.out.println("Calling from Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Searching from Airtel");
		
	}

}
