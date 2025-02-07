package com.datajpa.demo.com.datajpa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.demo.com.datajpa.demo.Entitites.Student;


public interface StudentRepo extends JpaRepository<Student,Integer>{

}
