package com.haiden.web.service;

import com.haiden.web.bean.User;

public interface IUserService {

	void save(User user);
	User load(int id);
}
