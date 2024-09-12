package com.prav.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RPStudentController {
	
	//Param names matched
	/*@RequestMapping("/data")
	public String studentdataRP(@RequestParam int sno,@RequestParam String sname, Map<String,Object> map)
	{
	System.out.println("Student name :"+sname);
	map.put("sno", sno);
	map.put("sname", sname);
	return "show_data";
	}*/
	
	
	//Req param names not matched with handler param name
	/*@RequestMapping("/data")
	public String studentdataRPUnMatch(@RequestParam("sno") int no,@RequestParam("sname") String name, Map<String,Object> map)
	{
	System.out.println("Student name :"+name);
	System.out.println("RPStudentController.studentdataRPUnMatch()");
	map.put("sno", no);
	map.put("sname", name);
	return "show_data";
	}*/

	//To avoid the exception with out giving or mistaken then req param name to handler method param the we need solve in two ways
	
	
	//to give requ param required is false
	/*@RequestMapping("/data")
	public String studentdataRPFirst(@RequestParam int sno,@RequestParam(required = false) String sname, Map<String,Object> map)
	{
	System.out.println("Student name :"+sname);
	map.put("sno", sno);
	map.put("sname", sname);
	return "show_data";
	}*/
	
	//to give requ param as defaultValue
	/*@RequestMapping("/data")
	public String studentdataRPSecond(@RequestParam int sno,@RequestParam(defaultValue = "Raja") String sname, Map<String,Object> map)
	{
	System.out.println("Student name :"+sname);
	map.put("sno", sno);
	map.put("sname", sname);
	return "show_data";
	}*/
		
	
	//Passing multiple req param
	/*@RequestMapping("/data")
	public String studentdataList(@RequestParam("sno") int no,
			@RequestParam("sname") String name,
			@RequestParam("addrs")String[] saddrs,
			@RequestParam("addrs")List<String> laddrs,
			@RequestParam("addrs")Set<String> setaddrs, 
			Map<String,Object> map)
	{
	System.out.println("Student name :"+name);
	System.out.println(Arrays.toString(saddrs)+"=="+laddrs+"=="+setaddrs);
	map.put("sno", no);
	map.put("sname", name);
	map.put("StringArray", saddrs);
	map.put("List", laddrs);
	map.put("Set", setaddrs);
	
	return "show_data";
	}*/
	
	//Passing multiple values in String
	@RequestMapping("/data")
	public String studentdataRPSecond(@RequestParam int sno,@RequestParam(defaultValue = "Raja") String sname,@RequestParam String addrs, Map<String,Object> map)
	{
	System.out.println("Student name :"+sname);
	System.out.println(addrs);
	map.put("sno", sno);
	map.put("sname", sname);
	map.put("Addrs", addrs);
	return "show_data";
	}
	
}
