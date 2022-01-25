package com.mouritech.hibernateexample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="mouri_course")
public class Course implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3768310304003290743L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int courseId;
	
	@Column(name = "cname" ,nullable = false)
	private String courseName;
	
	@Column(name = "cfees" ,nullable = false)
	private String courseFees;
	
	@Transient
	private String courseDescription;
	
	  public Course() {  }
	 

	public Course(String courseName, String courseFees) {
		super();
		this.courseName = courseName;
		this.courseFees = courseFees;
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(String courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	
	
	

}
