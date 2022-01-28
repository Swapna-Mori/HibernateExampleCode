package com.mouritech.manytomanyexample.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_data")
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name = "project_id")
	private Long projectId;
	
	@Column(name="projecttitle")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects",cascade = {CascadeType.ALL})
	private Set<Employee> employees = new HashSet<Employee>();
	
	
	public Project() {
		// TODO Auto-generated constructor stub
	}


	public Project(Long projectId, String projectName, Set<Employee> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employees = employees;
	}
	
	public Project(String projectName) {
		super();
		//this.projectId = projectId;
		this.projectName = projectName;
		//this.employees = employees;
	}


	public Long getProjectId() {
		return projectId;
	}


	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public Set<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
	
	

}
