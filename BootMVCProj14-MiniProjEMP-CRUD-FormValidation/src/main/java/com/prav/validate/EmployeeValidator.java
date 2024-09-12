package com.prav.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.prav.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) { //to check current model class is taken or not 
		return clazz.isAssignableFrom(Employee.class);//If its true next validation method executes otherwise not validates
	}

	@Override
	public void validate(Object target, Errors errors) {
		//type casting
		Employee emp=(Employee)target;
		if(emp.getEname()==null || emp.getEname().isBlank())//required
			errors.rejectValue("ename", "emp.name.required");
		else if(emp.getEname().length()<3 || emp.getEname().length()>10)
			errors.rejectValue("ename", "emp.name.length");
		if(emp.getJob()==null || emp.getJob().isBlank())//required
			errors.rejectValue("job", "emp.job.required");
		else if(emp.getEname().length()<3 || emp.getEname().length()>10)
			errors.rejectValue("job", "emp.job.length");
		if(emp.getSal()==null)
			errors.rejectValue("sal", "emp.sal.required");
		else if(emp.getSal()<2000 || emp.getSal()>200000)
			errors.rejectValue("sal", "emp.sal.range");
		if(emp.getDeptno()==null)
			errors.rejectValue("deptno", "emp.deptno.required");
		else if(emp.getDeptno()<10 || emp.getDeptno()>100)
			errors.rejectValue("deptno", "emp.deptno.range");
		
	}

}
