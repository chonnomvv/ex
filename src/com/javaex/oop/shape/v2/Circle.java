package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	//	필드
	private double radius;	//	반지름
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;	//	반지름 설정
	}
	
	//	추상메서드 구현
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%f]를 그렸습니다.%n",
				x, y, area());
	}
}
