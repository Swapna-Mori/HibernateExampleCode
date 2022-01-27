package com.mouritech.onetooneexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long empDetailsId;
	
	@Column(name = "hobby")
	private String empHobby;
	
	@Column(name = "extracurricular")
	private String empExtraCurricular;
	
	public Employee_Details() {
		// TODO Auto-generated constructor stub
	}

	public Employee_Details(Long empDetailsId, String empHobby, String empExtraCurricular) {
		super();
		this.empDetailsId = empDetailsId;
		this.empHobby = empHobby;
		this.empExtraCurricular = empExtraCurricular;
	}

	public Employee_Details(String empHobby, String empExtraCurricular) {
		super();
		this.empHobby = empHobby;
		this.empExtraCurricular = empExtraCurricular;
	}

	public Long getEmpDetailsId() {
		return empDetailsId;
	}

	public void setEmpDetailsId(Long empDetailsId) {
		this.empDetailsId = empDetailsId;
	}

	public String getEmpHobby() {
		return empHobby;
	}

	public void setEmpHobby(String empHobby) {
		this.empHobby = empHobby;
	}

	public String getEmpExtraCurricular() {
		return empExtraCurricular;
	}

	public void setEmpExtraCurricular(String empExtraCurricular) {
		this.empExtraCurricular = empExtraCurricular;
	}
	
	
}
