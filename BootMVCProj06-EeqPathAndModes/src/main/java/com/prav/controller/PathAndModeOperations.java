package com.prav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PathAndModeOperations {

	//Path is Case sensitive
	/*@RequestMapping("/report")
	public String show()
	{
		System.out.println("=====PathAndModeOperations.show()  first one=====");
		return "show_data";
	}
	
	@RequestMapping("/REPORT")
	public String show1()
	{
		System.out.println("=====PathAndModeOperations.show()  second one=====");
		return "show_details1";
	}*/
	
	
	//Multiple paths in @RequestMapping()
	/*@RequestMapping({"/report1","/report3","/report2"})
	public String show()
	{
		System.out.println("=====PathAndModeOperations.show()  first one=====");
		return "show_data";
	}*/
	
	
	//Get and Post Request Mapping
	
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("=====PathAndModeOperations.show()  first one=====");
		return "Welcome";
	}
	
	//@RequestMapping(value="/report",method=RequestMethod.GET)   ==Old Method
	@GetMapping("/report")
	public String show() throws Exception
	{
		System.out.println("=====PathAndModeOperations.show()  Get mode=====");
		return "forward:test/report";
	}
	//@RequestMapping(value="/report",method=RequestMethod.POST)   ==Old Method
	@PostMapping("/report")
	public String show1() throws Exception
	{ 
		System.out.println("=====PathAndModeOperations.show()1  Post mode=====");
		return "show_details1";
	}
	
}
