package com.javaex.oop.javaclass.point.v4;

public class ColorPoint extends Point {
	//	필드
	private String color;
	
	//	생성자
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("점[color=" + color +
				", x=" + super.getX() +
				", y=" + super.getY() +
				"]을 그렸습니다."
				);
	}
}
