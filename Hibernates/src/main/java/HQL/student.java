package HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class student {
	@Id()
	private int id;
	private String name;
	private int age;
	private String city;

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
