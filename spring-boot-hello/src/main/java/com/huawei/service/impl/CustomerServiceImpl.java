package com.huawei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huawei.dao.CustomerMapper;
import com.huawei.domain.Customer;
import com.huawei.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService
{

	@Resource
	private CustomerMapper customerMapper;

	@Override
	public void save(Customer customer)
	{
		if (customer.getId() != null)
		{
			customerMapper.update(customer);
		} else
		{

			customerMapper.save(customer);
		}

	}

	@Override
	public List<Customer> findAll()
	{
		return customerMapper.findAll();
	}

	@Override
	public Customer findById(int id)
	{
		return customerMapper.findById(id);
	}

	@Override
	public void deleteById(int id)
	{
		customerMapper.deleteById(id);
	}

}
