package com.prav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prav.model.Employee;
import com.prav.repo.IEmployeeRepo;

@Service
public class EmpService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public Iterable<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

	@Override
	public String employeeRegistrationServ(Employee emp) {
		
		return "The Employee added with id no ::"+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeByEmpno(int no) {
		// TODO Auto-generated method stub
		Employee emp=empRepo.findById(no).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return "Employee Updated having id value :: "+empRepo.save(emp).getEmpno();
	}

	@Override
	public String deleteEmployeeById(int no) {
		empRepo.deleteById(no);
		
		return no+" Employee id Employee is deleted"; 
	}

	@Override
	public Page<Employee> getAllEmpbyPages(Pageable pageable) {
		// TODO Auto-generated method stub
		return empRepo.findAll(pageable);
	}




}
