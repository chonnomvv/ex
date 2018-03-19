package com.javaex.basicapi.practice01;

public class Circle {
	//	필드
	private int x;
	private int y;
	private int radius;
	
	//	생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle)obj;
			return this.radius == other.radius;
		} else {
			return super.equals(obj);
		}
	}
}
