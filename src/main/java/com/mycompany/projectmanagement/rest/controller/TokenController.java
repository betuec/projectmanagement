package com.mycompany.projectmanagement.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.projectmanagement.rest.model.JwtUser;
import com.mycompany.projectmanagement.security.JwtGenerator;

@RestController
public class TokenController {

	private JwtGenerator genertor;

	public TokenController(JwtGenerator genertor) {
		super();
		this.genertor = genertor;
	}

	@PostMapping(value="/token")
	public String generate(@RequestBody final JwtUser jwtUser) {

		return genertor.generate(jwtUser);

	}
	
	@GetMapping(value="/rest/hello")
	public String HelloWorld()	{
		
		return "Hello World";
		
	}

}
