package com.haiden.guava;

import com.google.common.base.Predicate;
import com.haiden.entity.User;

public class UserPredicate implements Predicate<User>
{

	@Override
	public boolean apply(User input)
	{
		return input.getAge()>30&&input.getGender()=="ÄÐ";
	}

}
