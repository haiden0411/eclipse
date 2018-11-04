package com.haiden.guava;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.MoreObjects;

public class State
{
	private String name;
	private String code;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public Set<City> getMainCities()
	{
		return mainCities;
	}

	public void setMainCities(Set<City> mainCities)
	{
		this.mainCities = mainCities;
	}

	private Set<City> mainCities = new HashSet<City>();

	@Override
	public String toString()
	{
		return MoreObjects.toStringHelper(this).add("name", name).add("code", code).add("cities", mainCities)
				.toString();
	}
}
