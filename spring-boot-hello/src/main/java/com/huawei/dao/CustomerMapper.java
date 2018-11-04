package com.huawei.dao;

import java.util.List;

import com.huawei.domain.Customer;

public interface CustomerMapper
{
	public void save(Customer customer);

	public List<Customer> findAll();

	public Customer findById(int id);

	public void update(Customer customer);

	public void deleteById(int id);
}
