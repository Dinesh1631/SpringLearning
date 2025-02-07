package com.datajpa.demo.com.datajpa.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.datajpa.demo.com.datajpa.demo.Entitites.Student;
import com.datajpa.demo.com.datajpa.demo.repositories.StudentRepo;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
		/* CRUD Application Demo */
		StudentRepo studentrepo = context.getBean(StudentRepo.class);
		/*
		 * Creating the student Student student = new Student();
		 * student.setName("Dinesh"); student.setAddress("Hyderabad");
		 * studentrepo.save(student);
		 */

		/*
		 * Reading the students List<Student> students = studentrepo.findAll();
		 * students.forEach(st->System.out.println(st));
		 */

		/*
		 * Getting student by ID and updating Student st =
		 * studentrepo.findById(2).get(); System.out.println(st);
		 * System.out.println("After updating the student"); st.setName("Dinesh Yadav");
		 * System.out.println(st);
		 */

		/*
		 * Deleting the students studentrepo.deleteById(1);
		 * System.out.println("Deleted successfully");
		 */

		/* Performing batch insert */
		// Create a List to hold Student objects
//        List<Student> students = new ArrayList<>();
//
//        // Adding 10 Student objects to the list with manual IDs starting from 1
//        students.add(new Student("Alice", "123 Maple St"));
//        students.add(new Student("Bob", "456 Oak St"));
//        students.add(new Student("Charlie", "789 Pine St"));
//        students.add(new Student("David", "101 Cedar Ave"));
//        students.add(new Student("Eve", "202 Birch Rd"));
//        students.add(new Student("Frank", "303 Elm Dr"));
//        students.add(new Student("Grace", "404 Willow Ln"));
//        students.add(new Student("Hannah", "505 Cherry Blvd"));
//        students.add(new Student("Ian", "606 Redwood Pkwy"));
//        students.add(new Student("Jack", "707 Aspen Way"));

		/* Method for doing batch insert */

		/* studentrepo.saveAll(students); */

		/* Pagenination and sorting */
		Sort sort = Sort.by("name").ascending();
		List<Student> sortedList = studentrepo.findAll(sort);
		System.out.println("----------------------------------");
		sortedList.forEach(p -> System.out.println(p));
		System.out.println("----------------------------------");

		Pageable pageable = PageRequest.of(1, 3, sort);
		Page<Student> page = studentrepo.findAll(pageable);
		page.forEach(p -> System.out.println(p));
		System.out.println("No of elements in  the page : " + page.getTotalElements());
		System.out.println("No of Pages : " + page.getTotalPages());
	}

}
