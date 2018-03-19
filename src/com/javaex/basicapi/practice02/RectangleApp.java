package com.javaex.basicapi.practice02;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(6, 4);
		Rectangle r2 = new Rectangle(12, 2);
		//	r1과 r2의 면적은 같다
		Rectangle r3 = new Rectangle(3, 9);
		//	r3 면적은 r1, r2와 다르다
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));

	}

}
