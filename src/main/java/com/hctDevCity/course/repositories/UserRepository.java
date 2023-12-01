package com.hctDevCity.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hctDevCity.course.entitites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
