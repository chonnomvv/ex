package com.javaex.basicapi.stringclass;

public class StringEx04 {

	public static void main(String[] args) {
		//	문자열 변경, 조작 메서드들
		
		String s1 = "     Hello  ";
		String s2 = ", Java";
		
		String result;
		
		//	앞뒤 공백 제거
		s1 = s1.trim();
		System.out.println(s1);

		//	문자열 연결: concat
		result = s1.concat(s2);
		System.out.println(result);
		
		//	문자열 자르기: split -> 문자열 배열
		String[] split = result.split(",");
		
		for (String data: split) {
			System.out.println(data);
		}
		
		
	}

}
