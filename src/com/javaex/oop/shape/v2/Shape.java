package com.javaex.oop.shape.v2;

public abstract class Shape {	//	추상
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 메서드
//	public abstract void draw();
	public abstract double area();

}
