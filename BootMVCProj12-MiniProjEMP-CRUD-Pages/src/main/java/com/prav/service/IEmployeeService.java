package com.prav.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prav.model.Employee;

public interface IEmployeeService {
	
	public Iterable<Employee> getAllEmployees();
	public String employeeRegistrationServ(Employee emp);
	public Employee getEmployeByEmpno(int no);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int no);
	public Page<Employee> getAllEmpbyPages(Pageable pagable);
	
}
