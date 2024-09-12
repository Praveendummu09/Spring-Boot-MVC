package com.prav.service;

import com.prav.model.Employee;

public interface IEmployeeService {
	
	public Iterable<Employee> getAllEmployees();
	public String employeeRegistrationServ(Employee emp);
	public Employee getEmployeByEmpno(int no);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int no);

}
