package com.javaex.exception;

import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		
//		try {
			num = sc.nextInt();
			result = 100 / num;
			System.out.println("Result:" + result);
//		} catch(ArithmeticException e) {
//			System.out.println(x);
//		}

		sc.close();
	}

}
