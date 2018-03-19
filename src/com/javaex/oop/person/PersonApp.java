package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("남승균", 47);
		
		Student s = new Student("홍길동", 45, "활빈고");
		
		p.showInfo();
		s.showInfo();
	}

}
