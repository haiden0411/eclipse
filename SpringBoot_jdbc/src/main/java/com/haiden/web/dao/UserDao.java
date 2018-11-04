package com.haiden.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.haiden.web.bean.User;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void sava(User user) 
	{
		
		jdbcTemplate.update("insert into t_person(name) values(?)", user.getName());
	}

	@Override
	public User load(int id)
	{
		String sql = "select * from t_person where id=?";
		RowMapper<User> rowMapper= new BeanPropertyRowMapper<User>(User.class);
		User user = jdbcTemplate.queryForObject(sql,rowMapper,id);
		return user;
	}

}
