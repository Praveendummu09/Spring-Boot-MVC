package com.prav.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prav.model.Employee;

@Controller
public class ModelClassContoller {
	@GetMapping("/employee")
	public String dataPassing(Map<String, Object> map)
	{
		Employee emp=new Employee();
		emp.setEno(1001);emp.setEname("Rahul");emp.setSalary(15000.0f);emp.setVaccination(true);
		map.put("employee", emp);
		return "employee_report";
	}
	
	@GetMapping("/employees")
	public String dataPassingList(Map<String, Object> map)
	{
		List<Employee> empsList=List.of(new Employee(1002,"Raja", 1800.0f, true),
				new Employee(1004,"Abhi", 2000.0f, false),new Employee(1003,"Venky", 25000.0f, true));
		map.put("emps", empsList);
		return "employees_report";
	}
	

}
