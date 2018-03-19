package com.javaex.language.console;

import java.util.Scanner;

public class ConsoleQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		//	이름 입력
		System.out.print("이름:");
		
		String name = sc.next();
		
		//	나이 입력
		System.out.print("나이:");
		int age = sc.nextInt();
		
		//	결과 출력
		System.out.println("당신의 이름은 " + name
				+ ", 나이는 " + age + "입니다"
				);
		sc.close();
		
	}

}
