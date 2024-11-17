package Spring.Autowiring;

public class Heart {
	private String nameOfAnimal;
    private int noOfHearts;
    public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	
	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}
     public void pump() {
    	 System.out.println("Heart is pumping........");
    	 System.out.println(nameOfAnimal + " "+noOfHearts);
     }
}
