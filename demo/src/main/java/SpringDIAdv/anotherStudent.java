package SpringDIAdv;

public class anotherStudent {
    private mathCheat cheat;
    private String name;
    public void setName(String name) {
		this.name = name;
	}
	public void setCheat(mathCheat cheat) {
		this.cheat = cheat;
	}
	public void cheat() {
         cheat.startCheating();
    }
	public void sudentInfo() {
		System.out.println("My name is :" + name);
	}
}
