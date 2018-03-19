package com.javaex.language.condition;

import java.util.Scanner;

public class IfElseEx02 {

	public static void main(String[] args) {
		//	스캐너에서 정수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		//	판별
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		//	중첩 if
		if (num == 0) { 
			System.out.println("0입니다.");
		} else {
			//	양수 혹은 음수: 0아님
			if (num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		sc.close();

	}

}
