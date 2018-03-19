package com.javaex.basicapi.stringclass;

public class StringEx03 {

	public static void main(String[] args) {
		//	String에서 데이터 조회, 추출 관련 메서드들
		String s = "Java Programming is Fun?";
		
		//	인덱스 5에 위치한 문자는?
		System.out.println(s.charAt(5));
		//	"is" 문자열이 위치한 인덱스?
		System.out.println(s.indexOf("is"));
		
		//	문자열의 길이: length()
		System.out.println(s.length());
		System.out.println(s.charAt(s.length() - 1));
		
		//	replace 특정 문자를 다른 문자로 바꿈
		System.out.println(s.replace('?', '!'));
		System.out.println(s.replaceAll("Fun", "Funny"));
		
		//	필요한 문자열만 추출
		System.out.println(s.substring(0, 4));

	}

}
