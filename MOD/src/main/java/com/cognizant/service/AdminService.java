package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Technologies;

@Service
public interface AdminService {
	
	Technologies save(Technologies technologies);

	void deleteBytechnologiesId(long technologiesid);

}
