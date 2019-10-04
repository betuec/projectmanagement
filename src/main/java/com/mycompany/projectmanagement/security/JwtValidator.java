package com.mycompany.projectmanagement.security;

import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secretKey = "youtube";

	public JwtUser validate(String token) {

		JwtUser jwtUser = null;
		try {

			Claims body = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();

			jwtUser = new JwtUser();

			jwtUser.setUserName(body.getSubject());
			jwtUser.setId(Long.parseLong((String) body.get("userId")));
			jwtUser.setRole((String) body.get("role"));

		}

		catch (Exception e) {
			System.out.print(e);
		}

		return jwtUser;
	}

}
