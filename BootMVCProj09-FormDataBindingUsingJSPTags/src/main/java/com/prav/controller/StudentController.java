package com.prav.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prav.model.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public String welcomePage()
	{
		return "welcome";
	}
	@GetMapping("/register")
	public String student_register_form(@ModelAttribute("stud") Student st)
	{
		System.out.println("StudentController.student_register_form()");
		return "student_form";
	}
	@PostMapping("/register")
	public String student_register_details(Map<String,Object> map,@ModelAttribute("stud") Student st)
	{
		System.out.println("StudentController.student_register_details()");
		System.out.println(st);
		return "show_result";
	}
	
}
