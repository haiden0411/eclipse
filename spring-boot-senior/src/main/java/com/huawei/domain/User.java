package com.huawei.domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User
{
	private int id;
	@NotBlank(message = "用户不能为空")
	private String name;
	@NotBlank(message = "密码不能空")
	@Length(min = 4, max = 10, message = "密码必须在4-10位之间")
	private String password;
	@Min(value = 15)
	private int age;
	@Email(message = "邮箱不合法")
	private String email;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", email=" + email
				+ "]";
	}

}
