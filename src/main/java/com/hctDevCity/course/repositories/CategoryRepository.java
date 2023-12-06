package com.hctDevCity.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hctDevCity.course.entitites.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
