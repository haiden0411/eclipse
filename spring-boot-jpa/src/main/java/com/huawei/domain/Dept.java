package com.huawei.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_dept")
public class Dept
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "dept_Name")
	private String deptName;

	@OneToMany(mappedBy = "dept")
	private Set<Emp> emps = new HashSet<>();

	public Dept()
	{
		super();
	}

	public Dept(String deptName)
	{
		this.deptName = deptName;
	}

	public Set<Emp> getEmps()
	{
		return emps;
	}

	public void setEmps(Set<Emp> emps)
	{
		this.emps = emps;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}

}
