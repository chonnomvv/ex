package com.javaex.language.oper;

public class BitOperEx {

	public static void main(String[] args) {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2;
		System.out.println(Integer
				.toBinaryString(result));
		
		result = b1 | b2;
		System.out.println(Integer
				.toBinaryString(result));

		result = ~b1;
		System.out.println(Integer
				.toBinaryString(result));
	}

}
