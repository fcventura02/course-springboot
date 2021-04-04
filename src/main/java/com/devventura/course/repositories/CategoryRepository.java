package com.devventura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devventura.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
