package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.MentorDao;
import com.cognizant.entity.Mentor;
import com.cognizant.entity.User;

@Service
public class  MentorServiceImpl implements MentorService {

	@Autowired
	private MentorDao mentordao;

/*	@Override
	public Mentor findUser(String username, String password) {
		// TODO Auto-generated method stub
		return mentordao.findDistinctByUsernameAndPassword(username, password);
	}

	@Override
	public Mentor save(Mentor user) {
		// TODO Auto-generated method stub
		return mentordao.save(user);
	}

	@Override
	public Mentor findByUsername(String username) {
		// TODO Auto-generated method stub
		return mentordao.findByUsername(username);
	}
*/
	@Override
	public void delete(long mentorId) {
		// TODO Auto-generated method stub
		mentordao.deleteById(mentorId);
	}

@Override
public Mentor findUser(String username, String password) {
	// TODO Auto-generated method stub
	return  mentordao.findDistinctByUsernameAndPassword(username, password);
}

@Override
public Mentor save(Mentor mentor) {
	// TODO Auto-generated method stub
	return mentordao.save(mentor);
}

@Override
public Mentor findByUsername(String username) {
	// TODO Auto-generated method stub
	return null;
}


}

