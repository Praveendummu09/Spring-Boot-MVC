package com.prav.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataRenderingTest {
	
	//Forwarding the request internally use rd.forward(-,-).
	/*@RequestMapping("/process")
	public String dataRendering()
	{
		
		System.out.println("====DataRenderingTest.dataRendering()====");
		return "forward:report";
	}
	
	@RequestMapping("/report")
	public String dataRenderingChaining(Map<String, Object> map)
	{
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
		System.out.println("=====DataRenderingTest.dataRenderingChaining()=====");
		return "show";
	}*/
	
	
	//Redirect the request res.senRedirect(-,-);
	@RequestMapping("/process")
	public String dataRendering()
	{
		
		System.out.println("====DataRenderingTest.dataRendering()====");
		return "redirect:report";
	}
	
	@RequestMapping("/report")
	public String dataRenderingChaining(Map<String, Object> map)
	{
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
		System.out.println("=====DataRenderingTest.dataRenderingChaining()=====");
		return "show";
	}
	
}

