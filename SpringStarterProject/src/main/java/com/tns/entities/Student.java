package com.tns.entities;

import org.springframework.stereotype.Component;

@Component
public class Student 
{ 
	/*public Student()
	{
		super();
		System.out.println("bharathi");
	}*/
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.println("Student from B1-4");
	}

}
