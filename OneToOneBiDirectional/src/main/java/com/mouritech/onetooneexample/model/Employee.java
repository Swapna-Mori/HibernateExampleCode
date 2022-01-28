package com.mouritech.onetooneexample.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long empId;
	
	@Column(name = "first_name")
	private String empFirstName;
	
	@Column(name = "last_name")
	private String empLastName;
	
	@Column(name = "email")
	private String empEmail;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long empId, String empFirstName, String empLastName, String empEmail) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
	}

	public Employee(String empFirstName, String empLastName, String empEmail) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
	}
	
	//Joining two tables using one to one association
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee",fetch = FetchType.LAZY)
	//@JoinColumn(name ="emp_detail_id")
	private Employee_Details empDetails;
	
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Employee_Details getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(Employee_Details empDetails) {
		this.empDetails = empDetails;
	}
	
	
 
}
