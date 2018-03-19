package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx_Solution {

	public static void main(String[] args) {
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		
		try {
			num = sc.nextInt();
			result = 100 / num;
			System.out.println("Result:" + result);
		} catch(InputMismatchException e) {
			System.out.println("정수값이 아닙니다.");
		} catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		} finally {
			//	예외 유무에 상관없이 실행
		}

		sc.close();
	}

}
