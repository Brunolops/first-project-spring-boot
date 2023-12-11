package com.hctDevCity.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hctDevCity.course.entitites.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
