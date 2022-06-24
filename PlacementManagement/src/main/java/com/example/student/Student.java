package com.example.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	private Integer id;
	private String name;
	private String college;
	private Integer roll;
	private String qualification;
	private String course;
	private Integer year;
	private String certificate;
	private Integer hallticketno;
	
	//default constructor
	public Student() {
	}
	//parameterized constructor
	public Student(Integer id,String name,String college,Integer roll,String qualification,String course,Integer year,String certificate,Integer hallticketno)
	{
	    this.id=id;
	    this.name=name;
	    this.college=college;
	    this.roll=roll;
	    this.qualification=qualification;
	    this.course=course;
	    this.year=year;
	    this.certificate=certificate;
	    this.hallticketno=hallticketno;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}
}
