package com.prav.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prav.model.Employee;
import com.prav.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationsController {
	
	@Autowired
	private IEmployeeService empService;

	@GetMapping("/")
	public String showHomePage()
	{
		return "home";
	}
	
	@GetMapping("/report")
	public String getEmpData(Map<String, Object> map)
	{
		Iterable<Employee> itEmp=empService.getAllEmployees();
		System.out.println(itEmp.toString());
		map.put("Employees", itEmp);
		return "show_employee_data";
	}
	@GetMapping("/emp_add")
	public String FormforemployeRegistration(@ModelAttribute("emp") Employee emp)
	{
		return "register_Employee";
	}
	
	
	//Insertion operation
	
	/*@PostMapping("/emp_add")
	public String employeRegistration(@ModelAttribute("emp") Employee emp, 
			Map<String, Object> map)
	{
		String str=empService.employeeRegistrationServ(emp);
		Iterable<Employee> itEmp=empService.getAllEmployees();
		map.put("EmpMesg", str);
		map.put("Employees", itEmp);
		return "show_employee_data";
	}*/
	
	
	//to solve the double posting or form duplication problem
	
	//HttpSession Object (Scope : session scope(Browser))
	/*@PostMapping("/emp_add")
	public String employeRegistration(@ModelAttribute("emp") Employee emp, 
			HttpSession ses)
	{
		String str=empService.employeeRegistrationServ(emp);
		ses.setAttribute("msg", str);
		return "redirect:report";
	}*/
	
	//Using redirect attribute(Best)
	@PostMapping("/emp_add")
	public String employeRegistration(@ModelAttribute("emp") Employee emp, 
			RedirectAttributes attr)
	{
		String str=empService.employeeRegistrationServ(emp);
		attr.addFlashAttribute("msg", str);
		return "redirect:report";
	}
	
	
	
	//UPDATE OPERATION
	@GetMapping("/emp_edit")
	public String showEditForm(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp)
	{
		//get service class obj
		Employee emp1=empService.getEmployeByEmpno(no);
		//Copy data
		System.out.println(emp1.toString());
		BeanUtils.copyProperties(emp1, emp);
		return "update_form";
		
	}
	@PostMapping("/emp_edit")
	public String updatedEmployee(@ModelAttribute("emp") Employee emp, 
			RedirectAttributes attr)
	{
		//get service class obj
		String str=empService.updateEmployee(emp);
		attr.addFlashAttribute("msg", str);
		return "redirect:report";
		
	}
	
	
	//Now DELETION OPERATION
	@GetMapping("/emp_delete")
	public String deleteEmployee(@RequestParam("no") int no, 
		  RedirectAttributes attr) {
		String str=empService.deleteEmployeeById(no);
		attr.addFlashAttribute("msg", str);
		return "redirect:report";
	}
	
	
}
