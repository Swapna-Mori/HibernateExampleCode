package com.mouritech.manytomanyexample.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "employee_data")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long empId;
	
	@Column(name = "emp_firstname")
	private String empFirstName;
	
	@Column(name = "emp_lastname")
	private String empLastName;
	
	@Column(name = "emp_email")
	private String empEmail;
	
	@Column(name = "emp_dob")
	private LocalDate empDOB;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employees_projects",joinColumns = {@JoinColumn(name = "employee_id")},
					inverseJoinColumns = {@JoinColumn(name = "project_id")})
	Set<Project> projects = new HashSet<Project>();
	
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
	

	
	public Employee(String empFirstName, String empLastName, String empEmail, LocalDate empDOB) {
		super();
		//this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
		this.empDOB = empDOB;
	}

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

	public LocalDate getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmail=" + empEmail + ", empDOB=" + empDOB + ", projects=" + projects + "]";
	}





	
	
 
}

