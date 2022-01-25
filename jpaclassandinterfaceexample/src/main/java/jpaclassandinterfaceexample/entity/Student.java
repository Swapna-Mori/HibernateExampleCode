package jpaclassandinterfaceexample.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * Persistant class which is converted in to table 
 * in the database
 */
@Entity
@Table(name = "student_entity")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studId;
	private String studFirstName;
	private String studLastName;
	private String studContactNo;
	
	

	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String studFirstName, String studLastName, String studContactNo) {
		super();
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studContactNo = studContactNo;
	}



	public Student(Long studId, String studFirstName, String studLastName, String studContactNo) {
		super();
		this.studId = studId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studContactNo = studContactNo;
	}



	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getStudFirstName() {
		return studFirstName;
	}

	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}

	public String getStudLastName() {
		return studLastName;
	}

	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}

	public String getStudContactNo() {
		return studContactNo;
	}

	public void setStudContactNo(String studContactNo) {
		this.studContactNo = studContactNo;
	}



	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFirstName=" + studFirstName + ", studLastName=" + studLastName
				+ ", studContactNo=" + studContactNo + "]";
	}
	
	

}

