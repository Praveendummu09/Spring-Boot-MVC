package com.prav.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer eno;
	private String ename;
	private float salary;
	private boolean vaccination;

}
