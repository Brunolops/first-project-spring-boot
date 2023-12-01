package com.hctDevCity.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hctDevCity.course.entitites.User;

@RestController
@RequestMapping (value = "/users")

public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		User p = new User(1L, "Maria", "Maria@gmail.com", "999999", "123456");
		return ResponseEntity.ok().body(p);
	}

}
