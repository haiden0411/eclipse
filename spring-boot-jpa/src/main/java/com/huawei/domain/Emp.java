package com.huawei.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_emp")
public class Emp
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "address", length = 500)
	private String address;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "dept_id")
	private Dept dept;

	public Emp()
	{
	}

	public Emp(String name, String gender, String telephone, String address)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.telephone = telephone;
		this.address = address;
	}

	public Dept getDept()
	{
		return dept;
	}

	public void setDept(Dept dept)
	{
		this.dept = dept;
	}

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

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender + ", telephone=" + telephone + ", address="
				+ address + "]";
	}

}
