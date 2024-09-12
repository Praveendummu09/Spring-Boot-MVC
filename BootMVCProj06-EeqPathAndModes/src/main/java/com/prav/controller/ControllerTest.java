package com.prav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ControllerTest {
	@GetMapping("/report")
	public String testReq()
	{
		System.out.println("ControllerTest.testReq()====");
		return "show_details1";
	}

}
