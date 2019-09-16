package com.cognizant.service;

import org.springframework.stereotype.Service;


import com.cognizant.entity.User;
@Service
public interface UserService {


	User findUser(String username, String password);
	User save(User user);
	User findByUsername(String username);
	void delete(User user);
//	Set<FavoriteArticle> findByFavoriteArticle();

	User findByUserId(long userId);

}
