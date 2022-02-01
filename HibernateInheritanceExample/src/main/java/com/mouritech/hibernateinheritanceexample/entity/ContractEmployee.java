package com.mouritech.hibernateinheritanceexample.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cemployee")
public class ContractEmployee extends Employee {
	
	@Column(name = "emp_wkdays")
	private int workingdays;
	@Column(name="emp_ctname")
	private String contractorname;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int workingdays, String contractorname) {
		super();
		this.workingdays = workingdays;
		this.contractorname = contractorname;
	}

	public int getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}

	public String getContractorname() {
		return contractorname;
	}

	public void setContractorname(String contractorname) {
		this.contractorname = contractorname;
	}
	
	

}
