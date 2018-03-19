package com.javaex.language.condition;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int total = 0;
		int num;
		// 정수를 입력받고
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요. 0이면 종료");
			num = sc.nextInt();
//			total = total + num;
			total += num;
		} while(num != 0);
		//	0이면 종료
		//	0이 아니면 합계에 추가
		//	루프가 끝나면 결과를 출력
		System.out.println("합계:" + total);
		sc.close();
		

	}

}
