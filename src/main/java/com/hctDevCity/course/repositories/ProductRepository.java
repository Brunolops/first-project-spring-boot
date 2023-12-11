package com.hctDevCity.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hctDevCity.course.entitites.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
