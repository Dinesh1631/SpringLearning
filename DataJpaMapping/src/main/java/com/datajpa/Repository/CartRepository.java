package com.datajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer>{

}
