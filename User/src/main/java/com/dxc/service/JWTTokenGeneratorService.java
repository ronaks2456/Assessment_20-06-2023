package com.dxc.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dxc.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JWTTokenGeneratorService implements TokenGeneratorService {

	@Value("${jwt.secret.key}")
	private String secretKey;
	
	@Override
	public Map<String, String> generateToken(User user) {
		// TODO Auto-generated method stub
		String token = Jwts.builder().setSubject(user.getUserId())
				.setIssuer("User-Guy")
				.setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, secretKey)
				.compact();
				return Map.of("token",token);
	}

}
