package com.huawei.service;

import java.util.List;

import com.huawei.domain.Customer;

public interface CustomerService
{
	public void save(Customer customer);

	public List<Customer> findAll();

	public Customer findById(int id);

	public void deleteById(int id);

}
