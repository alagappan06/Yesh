package com.cognizant.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Mentor;
import com.cognizant.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Serializable> {

	User findDistinctByUsernameAndPassword(String username, String password);

	User findByUsername(String username);
	

	User findByUserId(long userId);
}
