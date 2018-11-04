package com.haiden.guava;

import com.google.common.base.Function;
import com.haiden.entity.User;

public class UserFunction implements Function<User, String>
{

	@Override
	public String apply(User input)
	{
		return input.getName()+":"+input.getGender();
	}

}
