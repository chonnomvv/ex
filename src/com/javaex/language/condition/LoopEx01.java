package com.javaex.language.condition;

public class LoopEx01 {

	public static void main(String[] args) {
		//	1 ~ 20까지 돌면서
		for (int i = 1; i <= 20; i++) {
		//	2의 배수, 3의 배수면 출력하지 않고
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
		//	다른 값들은 출력
			System.out.println(i);
		}
		
	}

}
