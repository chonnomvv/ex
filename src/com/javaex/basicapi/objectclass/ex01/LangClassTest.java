package com.javaex.basicapi.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		
		//	클래스 이름
		System.out.println(p.getClass().getName());
		//	객체 식별값: hashCode
		System.out.println(p.hashCode());
		//	문자열 출력 형식 : toString()
		System.out.println(p.toString());
		//	toString 생략
		System.out.println(p);

	}

}
