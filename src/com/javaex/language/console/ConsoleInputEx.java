package com.javaex.language.console;

import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		//	스캐너 로드
		Scanner sc = new Scanner(System.in);
		
		//	정수 입력을 받자
		int num = sc.nextInt();
		System.out.println(num);
		
		// 이름을 입력받아 보겠습니다.
		String name = sc.next();
		System.out.println("Welcome, " + name);
		
		sc.close();
		
		
		

	}

}
