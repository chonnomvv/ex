package com.javaex.language;

public class VarEx {
	public static void main(String[] args) {
		// 변수 선언
		//	문자, 숫자, $, _
		//	숫자로 시작하면 안됨
		//	관례) 변수는 소문자로 구성,
		//	단어의 조합, 뒤 단어의 첫글자를 대문자
		
		//	방법 1
//		int myAge; //	변수를 선언
//		myAge = 47;
		
		//	방법 2
		int myAge = 47;
		
		//	조회 및 사용
		System.out.println(myAge);
		
		//	변수의 변경
		myAge = 46;
		
		System.out.println(myAge);
		
		//	여러 변수 동시 선언
		int v1 = 10, v2 = 20, v3 = 30;
		v1 = v2 = v3 = 40;
	}
}






