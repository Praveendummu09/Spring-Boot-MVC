package com.prav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomePage {
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}

}
