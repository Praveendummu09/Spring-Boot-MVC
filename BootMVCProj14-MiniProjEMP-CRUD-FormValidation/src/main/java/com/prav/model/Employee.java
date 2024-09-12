package com.prav.model;





import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
@SQLDelete(sql="UPDATE EMPLOYEE SET STATUS='inactive' WHERE EMPNO=?")
@SQLRestriction("STATUS <> 'inactive'")


public class Employee {

	@Id
	@SequenceGenerator(name = "gen1" ,sequenceName = "employee_id_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	private Float sal;
	private Integer deptno;
	private String status="active";
	@Transient
	private String vflag="no";
	
}
