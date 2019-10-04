package com.mycompany.projectmanagement.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@GetMapping(value="/login")
	public ResponseEntity<String> basicAuthentication() {

		return new ResponseEntity<String>("Authentication success", HttpStatus.OK);

	}

}
