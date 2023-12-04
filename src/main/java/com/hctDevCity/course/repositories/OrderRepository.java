package com.hctDevCity.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hctDevCity.course.entitites.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
