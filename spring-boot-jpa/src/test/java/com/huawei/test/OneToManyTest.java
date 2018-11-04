package com.huawei.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huawei.Application;
import com.huawei.dao.EmpRepository;
import com.huawei.domain.Dept;
import com.huawei.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class OneToManyTest
{
	@Resource
	private EmpRepository empRepository;

	@Test
	public void testSave()
	{
		// 创建部门

		Dept dept = new Dept("后期部");

		// 创建员工
		Emp emp = new Emp("贺小丽", "女", "1365245252", "风景园");
		dept.getEmps().add(emp);
		emp.setDept(dept);
		empRepository.save(emp);
		System.out.println("保存成功");
	}

	@Test
	public void testFind()
	{
		Emp emp = empRepository.findOne(4);
		Dept dept = emp.getDept();
		System.out.println("员工" + emp.getName() + "的部门名称是" + dept.getDeptName());
	}
}
