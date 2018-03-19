package com.javaex.language.condition;

import java.util.Scanner;

public class WhileGugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		
		//	메시지 출력, dan 값 입력
		System.out.println("단을 입력하세요");
		System.out.print("단:");
		dan = sc.nextInt();
		
		while(i <= 9) {
			//	구구단 출력
			System.out.println(dan + "*" + i 
					+ "=" + (dan * i)
					);
			i++;
		}
		
		sc.close();
	}
}
