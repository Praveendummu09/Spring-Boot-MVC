package com.prav.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataPassing_Rendering {

	//Passing Normal Data
	/*@GetMapping("/")
	public String passData(Map<String,Object> map)
	{
		map.put("Name", "Praveen");
		map.put("id", 152);
		return "show_data";
	}*/
	
	//Passing Arrays and Collections
	@GetMapping("/")
	public String passingCollection(Map<String,Object> map)
	{
		map.put("Subject",new String[] {"ADS","DS","CN","DBMS","Crypt","R"});
		map.put("Branch",List.of("CSE","EEE","ECE","Civil","Mech"));
		map.put("id", Set.of(14,13,18,19,21));
		map.put("details",Map.of("adhar",1458545,"PAN",425445));
		return "show_data";
	}
	
}
