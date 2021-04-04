package com.devventura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devventura.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
