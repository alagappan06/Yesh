package com.cognizant.controller;

import java.sql.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Technologies;
import com.cognizant.entity.User;

import com.cognizant.service.AdminService;
import com.cognizant.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/admin")

public class AdminController {
	
	

	@Autowired
	private UserService userService;

	

	@Autowired
   private AdminService adminservice;
	

	
	@RequestMapping(value = "/Authorization", method = RequestMethod.POST)
	public String login(@RequestBody User login) throws ServletException {

		String jwtToken = "";
		if (login.getUsername() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String username = login.getUsername();
		String password = login.getPassword();
		
		User user = userService.findUser(username, password);
		String usertype=user.getUsertype();
		String pwd = user.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your username and password.");
		}
		if(usertype.equalsIgnoreCase("admin"))
		{
		jwtToken = Jwts.builder().setSubject(username).claim("roles", "user")
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		}
		else
		{
			throw new ServletException("No an Admin");
		}
		return jwtToken;
		
	}
	@RequestMapping(value = "/addtechnologies", method = RequestMethod.POST)
	public Technologies addTechnologies(@RequestBody Technologies technologies)  {
		return adminservice.save(technologies);
		
	}
	
	@RequestMapping(value = "/block/user", method = RequestMethod.POST)
	
@Transactional
public String blockUser(@RequestParam long userId){
User user=new User();
	user=userService.findByUserId(userId);
	if(user.getIsblock()==true)
		
	{
		return "user is blocked already";
	}
	else{
		user.setIsblock(true);
		return "user is blocked now";
	}
	}
	@RequestMapping(value = "/unblock/user", method = RequestMethod.POST)
	@Transactional
	public String unblockUser(@RequestParam long userId){
	User user=new User();
		user=userService.findByUserId(userId);
		if(user.getIsblock()==true)
			
		{
			user.setIsblock(false);
			return "user is now unblocked";
		}
		else{
			
			return "user is not blocked";
		}
		}
		@RequestMapping(value = "/delete/technologies", method = RequestMethod.POST)
		public String deleteTechnologies(@RequestParam long technologiesid)  {
			
 			
			adminservice.deleteBytechnologiesId(technologiesid);
      return "technologiesid  Deleted";
			
		}
	}

