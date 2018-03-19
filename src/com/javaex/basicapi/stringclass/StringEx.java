package com.javaex.basicapi.stringclass;

public class StringEx {

	public static void main(String[] args) {
		//	할당
		String str1 = "abc";	//	리터럴로 할당
		String str2 = new String("abc");	//	new로 할당
		String str3 = str1;	//	다른 문자열의 주소로 할당
		
		char[] letters = {'J', 'A', 'V', 'A'};
		String str4 = new String(letters);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
