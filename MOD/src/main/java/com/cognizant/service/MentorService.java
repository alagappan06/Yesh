package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Mentor;

@Service
public interface MentorService {


	Mentor findUser(String username, String password);
	Mentor save(Mentor mentor);
	Mentor findByUsername(String username);
	
	void delete(long mentorId);
	
}
