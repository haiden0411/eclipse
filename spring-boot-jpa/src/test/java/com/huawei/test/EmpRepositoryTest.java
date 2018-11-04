package com.huawei.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huawei.Application;
import com.huawei.dao.EmpRepository;
import com.huawei.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class EmpRepositoryTest
{
	@Resource
	private EmpRepository empRepository;

	/**
	 * 
	 */
	@Test
	public void testSave()
	{
		Emp emp = new Emp();
		emp.setName("陈聘");
		emp.setGender("女");
		emp.setTelephone("15899258252");
		emp.setAddress("振业峦山谷");
		// empRepository.save(emp);
	}

	@Test
	public void testFindByName()
	{
		List<Emp> list = empRepository.findByName("张三");

		for (Emp emp : list)
		{
			System.out.println(emp);
		}

	}

	@Test
	public void testFindByNameAndGender()
	{
		List<Emp> list = empRepository.findByNameAndGender("李四", "男");

		for (Emp emp : list)
		{
			System.out.println(emp);
		}

	}

	@Test
	public void testFindByTelephoneLike()
	{
		List<Emp> list = empRepository.findByTelephoneLike("%158%");

		for (Emp emp : list)
		{
			System.out.println(emp);
		}

	}

	@Test
	public void testSort()
	{
		Sort sort = new Sort(new Order(Direction.ASC, "id"));
		Iterable<Emp> list = empRepository.findAll(sort);
		for (Emp emp : list)
		{
			System.out.println(emp);
		}
	}

	@Test
	public void testPaginate()
	{
		Sort sort = new Sort(new Order(Direction.DESC, "id"));
		Pageable page = new PageRequest(0, 2, sort);
		Page<Emp> pageData = empRepository.findAll(page);
		System.out.println("总记录:" + pageData.getTotalElements());
		List<Emp> content = pageData.getContent();
		for (Emp emp : content)
		{
			System.out.println(emp);
		}

		System.out.println("总页数:" + pageData.getTotalPages());
	}

	@Test
	public void testFindAll()
	{
		List<Emp> list = empRepository.findAll();
		for (Emp emp : list)
		{
			System.out.println(emp);
		}
	}

	@Test
	public void testSpecifiactionExcutor()
	{
		Specification<Emp> sepc = new Specification<Emp>()
		{

			@Override
			public Predicate toPredicate(Root<Emp> root, CriteriaQuery<?> query, CriteriaBuilder cb)
			{
				List<Predicate> preList = new ArrayList<>();

				preList.add(cb.equal(root.get("name"), "陈聘"));
				preList.add(cb.equal(root.get("gender"), "女"));

				Predicate[] preArray = new Predicate[preList.size()];
				return cb.and(preList.toArray(preArray));
			}

		};

		List<Emp> list = empRepository.findAll(sepc);
		for (Emp emp : list)
		{
			System.out.println(emp);
		}
	}

}
