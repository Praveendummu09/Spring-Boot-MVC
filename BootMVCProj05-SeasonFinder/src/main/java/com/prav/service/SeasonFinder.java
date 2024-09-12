package com.prav.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinder {

	public String findSeason()
	{
		LocalDate ld=LocalDate.now();
		int mon=ld.getMonthValue();
		if(mon>=6 && mon<=10)
			return "Rainy Season";
		else if(mon>=3 && mon<=5)
			return "Summer Season";
		else
			return "Winter Season";
	}
}
