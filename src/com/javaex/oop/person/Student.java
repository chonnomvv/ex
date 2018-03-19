package com.javaex.oop.person;

public class Student extends Person {
	//	필드
	private String schoolName;
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("%s (%d, %s)", 
				name, age, schoolName
				);
	}
}
