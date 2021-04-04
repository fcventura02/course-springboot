package com.devventura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devventura.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
