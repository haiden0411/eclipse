package com.haiden.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haiden.web.bean.User;
import com.haiden.web.dao.UserDao;


@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;
	@Override
	public void save(User user) {
		userDao.sava(user);
	}

	@Override
	public User load(int id) {
		return userDao.load(id);
	}

	
}
