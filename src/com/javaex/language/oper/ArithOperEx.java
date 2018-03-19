package com.javaex.language.oper;

public class ArithOperEx {

	public static void main(String[] args) {
		//	부호: +, -
		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		System.out.println(-1 * a);
		
		System.out.println("----------");
		
		//	사칙연산 : +, -, *, /, %
		
		System.out.println(a + b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("----------");
		
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		
		//	++, --
		System.out.println("---- 증감 ----");
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);
		
		//	나눗셈에 대해 조금만 보충
		System.out.println("---- 나눗셈 보충 ----");
		//System.out.println(4 / 0);	// Exception
		System.out.println(4.0 / 0);
		
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(4.0 / 0));
		
		//	실수의 나머지 연산 
		System.out.println(7.2 % 2.0);
		
		
		
		
		
		
		
		
		
		
		

	}

}
