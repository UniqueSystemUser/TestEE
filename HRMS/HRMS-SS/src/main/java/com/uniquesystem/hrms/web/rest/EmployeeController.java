package com.uniquesystem.hrms.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniquesystem.hrms.model.Employee;
import com.uniquesystem.hrms.repository.EmployeeRepository;

@RestController
@RequestMapping("/hrms")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping(value="/employee/add")
	public String addEmployeeSubmit(@Valid @RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee added successfully!!!!";
	}
	
	@GetMapping(value="/employee/list")
	public List <Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}

}
