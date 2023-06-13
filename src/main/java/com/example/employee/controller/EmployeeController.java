package com.example.employee.controller;

import java.util.List;

import com.example.employee.entity.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("employee")

public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/listar")
	public Result listarEmployee(){
		return service.listarEmployee();
	}
	

	
	
	

}
