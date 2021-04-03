package com.devventura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devventura.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
