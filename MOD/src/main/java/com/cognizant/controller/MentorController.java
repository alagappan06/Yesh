package com.cognizant.controller;


import java.sql.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Mentor;
import com.cognizant.entity.User;
import com.cognizant.service.MentorService;
import com.cognizant.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/mentor")
public class MentorController {


	@Autowired
	private MentorService mentorService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Mentor registerUser(@RequestBody Mentor mentor) {
		return mentorService.save(mentor);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody Mentor login) throws ServletException {

		String jwtToken = "";

		if (login.getUsername() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String username = login.getUsername();
		String password = login.getPassword();

		Mentor mentor = mentorService.findUser(username, password);

		if (mentor == null) {
			throw new ServletException("User email not found.");
		}

		String pwd = mentor.getPassword();     ///////////user

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your name and password.");
		}

		jwtToken = Jwts.builder().setSubject(username).claim("roles", "mentor").setIssuedAt(new Date(0))
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}

	
}
