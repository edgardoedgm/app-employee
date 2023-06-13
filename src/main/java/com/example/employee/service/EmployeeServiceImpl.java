package com.example.employee.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employee.entity.Employee;
import com.example.employee.entity.Result;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private RestTemplate employeeRest;

	@Override
	public Result listarEmployee() {

		Result employees = employeeRest.getForObject("https://dummy.restapiexample.com/api/v1/employees", Result.class);

		return employees;
	}

}
