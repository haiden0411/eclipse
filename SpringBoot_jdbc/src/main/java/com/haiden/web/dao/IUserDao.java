package com.haiden.web.dao;

import com.haiden.web.bean.User;

public interface IUserDao {
	void sava(User user);
	User load(int id);
}
