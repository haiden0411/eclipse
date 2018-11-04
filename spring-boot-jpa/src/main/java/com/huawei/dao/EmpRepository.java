package com.huawei.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.huawei.domain.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>, JpaSpecificationExecutor<Emp>
{
	public List<Emp> findByName(String name);

	public List<Emp> findByNameAndGender(String name, String gender);

	public List<Emp> findByTelephoneLike(String telephone);

}
