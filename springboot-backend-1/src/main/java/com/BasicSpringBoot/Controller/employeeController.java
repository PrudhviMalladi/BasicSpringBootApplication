package com.BasicSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BasicSpringBoot.Modern.employee;
import com.BasicSpringBoot.Repository.employeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class employeeController {

	@Autowired
	private employeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<employee> getAllemployee(){
		return employeeRepository.findAll();
	}
}
