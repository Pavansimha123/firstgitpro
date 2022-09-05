package com.employee.angularr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.angularr.model.Employee;
import com.employee.angularr.repository.employeerepo;

@RestController
@RequestMapping("/employee")
public class Controller {
	
	@Autowired
	private employeerepo repo;
	
	@GetMapping("/")
	public List<Employee> getAllemployee()
	{
		return repo.findAll();
	}

}
