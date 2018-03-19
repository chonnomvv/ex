package com.javaex.basicapi.practice02;

public class Rectangle {
	//	필드
	private int width;
	private int height;
	
	//	생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//	면적 메서드
	private int getArea() {
		return width * height;
	}
	
	//	equals 메서드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return getArea() == other.width * other.height;
		} else {
			return super.equals(obj);
		}
	}
}
