package com.devventura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devventura.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
