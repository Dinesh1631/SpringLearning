package ProxyDemonstation;

import java.util.Date;

public class Attendence {
       private boolean isPresent;
       private Date date;
       
	public Attendence(boolean isPresent, Date date) {
		this.isPresent = isPresent;
		this.date = date;
	}
	
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
