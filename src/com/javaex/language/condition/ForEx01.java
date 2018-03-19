package com.javaex.language.condition;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		//	단을 입력(스캐너)
		//	루프(for) - 안에서 dan * 1,2,3,4,...9
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		System.out.print("단:");
		
		int dan = sc.nextInt();
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num +
					"=" + dan * num);
		}
		sc.close();

	}

}
