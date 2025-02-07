package com.datajpa.Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.datajpa.Entities.Cart;
import com.datajpa.Entities.Product;
import com.datajpa.Repository.CartRepository;
import com.datajpa.Repository.productRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.datajpa.Repository")
@EntityScan(basePackages = "com.datajpa.Entities")
public class DataJpaMappingApplication implements CommandLineRunner {
	@Autowired
	productRepo prodrepo;
	@Autowired
	CartRepository cartrepo;

	public static void main(String[] args) {
		SpringApplication.run(DataJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//     Person person = new Person();
//     person.setPersonName("Dinesh");
//     
//     Mobile mobile = new Mobile();
//     mobile.setMobileName("Samsung");
//     
//     person.setMobile(mobile);
//     mobile.setPerson(person);
//     
//    
//     personrepo.save(person);
//     mobilerepo.save(mobile);     
		
//		 Person person = personrepo.findById(1).get();
//		 Mobile mobile = mobilerepo.findById(1).get();
//		 System.out.println("PersonName : "+ person.getPersonName());
//		 System.out.println("MobileNmae : "+ person.getMobile().getMobileName());
//		 
//		 System.out.println("MobileName : "+ mobile.getMobileName());
//		 System.out.println("PersonName : "+ mobile.getPerson().getPersonName());
//		 
//		 personrepo.delete(person);
//		 System.out.println("Deleted Successfully");
		
		
		/*OneToMany and ManyToOne*/
//		Student student1 = new Student();
//		student1.setStudentName("Dinesh");
//		
//		Student student2 = new Student();
//		student2.setStudentName("Pavan");
//		
//		Address add1 = new Address();
//		add1.setCity("Hyderadad");
//		
//		Address add2 = new Address();
//		add2.setCity("Sathupally");
//		
//		Address add3 = new Address();
//		add3.setCity("Hyderadad");
//		
//		Address add4 = new Address();
//		add4.setCity("Bhimavaram");
//		
//		List<Address> list1 = new ArrayList<>();
//		list1.add(add1);
//		list1.add(add2);
//		
//		List<Address> list2 = new ArrayList<>();
//		list2.add(add3);
//		list2.add(add4);
//		
//		student1.setAdress(list1);
//		student2.setAdress(list2);
//		
//		add1.setStudent(student1);
//		add2.setStudent(student1);
//		add3.setStudent(student2);
//		add4.setStudent(student2);
//		
//		addressrepo.save(add1);
//     	addressrepo.save(add2);
//		addressrepo.save(add3);
//		addressrepo.save(add4);
		
 		
		
		/* Many to Many */
		
		
		/*Products*/
		
		List<Product> dineshprods = new ArrayList<>();
		Product prod1 = new Product();
		prod1.setProductName("TV");
		dineshprods.add(prod1);
		Product prod2 = new Product();
		prod2.setProductName("AC");
		dineshprods.add(prod2);
		
		List<Product> pavanprods = new ArrayList<>();
		Product prod3 = new Product();
		prod3.setProductName("Fridge");
		pavanprods.add(prod3);
		Product prod4 = new Product();
		prod4.setProductName("Cooler");
		pavanprods.add(prod4);
		
		
		/*Catagory*/
		List<Cart> dineshCart = new ArrayList<>();
		Cart cart1 = new Cart();
		cart1.setCartName("DineshCart");
		dineshCart.add(cart1);
		List<Cart> pavanCart = new ArrayList<>();
		Cart cart2 = new Cart();
		cart2.setCartName("PavanCart");
		pavanCart.add(cart2);
		
	   cart1.setProducts(dineshprods);
	   cart2.setProducts(pavanprods);
	   
	   prod1.setCarts(dineshCart);
	   prod2.setCarts(dineshCart);
	   prod3.setCarts(pavanCart);
	   prod4.setCarts(pavanCart);
	   
	   prodrepo.save(prod1);
	   prodrepo.save(prod2);
	   prodrepo.save(prod3);
	   prodrepo.save(prod4);
	   
		
	}

}
