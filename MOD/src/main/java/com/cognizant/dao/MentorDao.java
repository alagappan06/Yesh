package com.cognizant.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cognizant.entity.Mentor;
import com.cognizant.entity.User;


@Repository
public interface MentorDao extends CrudRepository<Mentor, Serializable> {

	Mentor findDistinctByUsernameAndPassword(String username, String password);
}

