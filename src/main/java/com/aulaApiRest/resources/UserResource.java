package com.aulaApiRest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaApiRest.entities.UserName;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<UserName> findAll() {
		UserName user = new UserName(1L, "Fernanda", "fernanda@gmail.com", "999999", "123456");
		return ResponseEntity.ok().body(user);
	}

}
