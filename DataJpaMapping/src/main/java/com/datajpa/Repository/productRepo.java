package com.datajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.Entities.Product;

public interface productRepo extends JpaRepository<Product,Integer>{

}
