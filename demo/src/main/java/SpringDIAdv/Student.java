package SpringDIAdv;

public class Student {
     private cheat Cheat;
     private String name ;
     

	public void setName(String name) {
		this.name = name;
	}

	public void setCheat(cheat  cheat) {
		this.Cheat = cheat;
	}
	
	public void sudentInfo() {
		System.out.println("My name is :" + name);
	}
	
	
	public void cheat () {
		Cheat.cheat();
	}
	
     
}
