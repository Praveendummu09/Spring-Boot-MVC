package com.prav.controller;

import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class DataRenderingTest {
	
	/*@RequestMapping("/process")
	public String dataRendering(HttpServletRequest req,HttpServletResponse res)
	{
		
		System.out.println("DataRenderingTest.dataRendering() ::"+req.hashCode());
		req.setAttribute("attr1","val1");
		
		return "show";
	}*/
	
	//HttpSession as parameter
	/*@RequestMapping("/process")
	public String dataRendering(HttpSession obj)
	{
		
		System.out.println("DataRenderingTest.dataRendering() ::"+obj.hashCode());
		obj.setAttribute("attr1","val1");
		
		return "show";
	}*/
	
	
	
	//To pass ServletConfig obj and ServletContext obj to controller class
	/*@Autowired
	private ServletConfig sc;
	@Autowired
	private ServletContext st;
	
	@RequestMapping("/process")
	public String process(Map<String,Object>map)
	{
		System.out.println("WebApplication Context path ::"+st.getContextPath());
		System.out.println("Ds logic name  ::"+sc.getServletName());
		map.put("attr1","Praveen");
		return "show";
	}*/
	
	
	//Given result without using view comp
	@RequestMapping("/process")
	public void process(HttpServletResponse res) throws Exception
	{
		PrintWriter writer=res.getWriter();
		res.setContentType("text/html");
		writer.println("<b> Directlu from Handler Method</b>");
	}

}