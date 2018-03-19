package com.javaex.language.reftypes;

public class StringEx01 {

	public static void main(String[] args) {
		//	문자열 선언
		String str1;
		str1 = "Java";	//	리터럴로 문자열 할당
		String str2 = "Java";	//	리터럴
		String str3 = new String("Java");
		
		//	str1과 str2를 비교해 봅시다
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		//	값의 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
