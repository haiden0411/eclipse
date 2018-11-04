package com.huawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.domain.Customer;
import com.huawei.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
	@Resource
	private CustomerService customerService;

	@RequestMapping("/input")
	public String input()
	{

		return "input";
	}

	@RequestMapping("/save")
	public String save(Customer customer)
	{
		customerService.save(customer);
		return "redirect:/customer/list	";
	}

	@RequestMapping("/list")
	public String list(Model model)
	{
		List<Customer> customers = customerService.findAll();
		model.addAttribute("list", customers);
		return "customerList";
	}

	@RequestMapping("/findById")
	public String findById(int id, Model model)
	{

		Customer cust = customerService.findById(id);
		model.addAttribute("cust", cust);
		return "update";
	}

	@RequestMapping("/deleteById")
	public String deleteById(int id)
	{
		customerService.deleteById(id);
		return "redirect:/customer/list";
	}
}
