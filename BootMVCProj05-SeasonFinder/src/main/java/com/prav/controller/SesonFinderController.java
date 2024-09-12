package com.prav.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prav.service.SeasonFinder;

@Controller
public class SesonFinderController {
	
	@Autowired
	private SeasonFinder sf;
	
	@RequestMapping("/")
	public String welcomePage()
	{
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String season(Map<String,Object> map)
	{
		String seas=sf.findSeason();
		map.put("season",seas);
		return "Season";
	}

}
