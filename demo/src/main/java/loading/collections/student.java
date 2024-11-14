package loading.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class student {
	private String name;
	private List<String> Address;
	private Set<String> phones;
	private Map<String,Integer> courses;
    @Override
	public String toString() {
		return "student [name=" + name + ", Address=" + Address + ", phones=" + phones + ", courses=" + courses + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	
}
