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
	/*@RequestMapping("/process")
	public String dataRendering(Map<String, Object> map)
	{
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
		return "show";
	}*/
	/*@RequestMapping("/process")
	public String dataRendering(Model map)
	{
		map.addAttribute("attr1", "val1");
		map.addAttribute("attr2", LocalDateTime.now());
		return "show";
	}*/
	
	
	//Handler Class return type is Model 
	/*@RequestMapping("/show")//here path is taken as LVN
	public Model dataRndering()
	{
		//Shared memory manually created
		Model map=new BindingAwareModelMap();
		map.addAttribute("attr1", "val1");
		map.addAttribute("attr2", LocalDateTime.now());
		return map;
	}*/
	
	//Handler Class return type is Model 
	/*@RequestMapping("/show")//here path is taken as LVN
	public Map<String, Object> dataRndering()
	{
		//Shared memory manually created
		Map<String,Object> map=new HashMap<String, Object>();
		//Add model attribute values
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
		return map;
	}*/
	
	
	////Handler Class return type is ModelAndView (legacy class)
	/*@RequestMapping("/show")//here path is taken as LVN
	public ModelAndView dataRndering()
	{
		//Shared memory manually created
		ModelAndView mav=new ModelAndView();
		//Add model attribute values
		mav.addObject("attr1", "val1");
		mav.addObject("attr2", LocalDateTime.now());
		return mav;
	}*/
	
	
	//Retrun type is void and request path taken as LVN
	/*@RequestMapping("/show")
	public void dataRendering(Map<String, Object> map)
	{
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
	}*/
	
	//Retrun type is null
	@RequestMapping("/show")
	public String dataRendering(Map<String, Object> map)
	{
		map.put("attr1", "val1");
		map.put("attr2", LocalDateTime.now());
		return null;
	}
}

