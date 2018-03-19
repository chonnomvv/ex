package com.javaex.basicapi.practice01;

public class CircleApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 10, 30);
		Circle c2 = new Circle(20, 20, 30);
		//	c1과 c2는 반지름이 같다
		Circle c3 = new Circle(10, 10, 20);
		//	c3는 c1, c2와 반지름이 다르다
		
		//	반지름이 같은 c1과 c2를 equals로 체크
		System.out.println(c1.equals(c2));
		//	반지름이 다른 c1과 c3를 equals로 체크
		System.out.println(c1.equals(c3));

	}

}
