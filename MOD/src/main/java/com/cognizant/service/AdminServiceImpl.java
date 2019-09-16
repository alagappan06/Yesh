package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminDao;
import com.cognizant.entity.Technologies;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class AdminServiceImpl implements AdminService{
 
	@Autowired
	private AdminDao adminDao;

	@Override
	public Technologies save(Technologies technologies) {
	
		return adminDao.save(technologies);
	}

	@Override
	public void deleteBytechnologiesId(long technologiesid) {
		adminDao.deleteById(technologiesid);
		
	}
	
	
	
	
}
