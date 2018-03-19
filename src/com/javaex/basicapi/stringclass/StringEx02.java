package com.javaex.basicapi.stringclass;

public class StringEx02 {

	public static void main(String[] args) {
		//	리터럴 생성 vs new 생성
		String s1 = "Hello";	//	리터럴 생성
		String s2 = "Hello";	//	같은 리터럴
		
		System.out.println(s1 == s2);
		
		String s3 = new String("Hello");	//	new 생성
		String s4 = new String("Hello");
		
		System.out.println(s3 == s4);
		
		System.out.println(s1 == s3); 
		// 리터럴 생성과 new 생성값 비교

		System.out.println(s1.equals(s4));
		//	값 자체의 비교
	}

}
