package com.javaex.oop.person;

public class Person {
	//	필드
	protected String name;
	protected int age;
	
	//	생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getters / setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "(" + age + ")");
	}
	
}
