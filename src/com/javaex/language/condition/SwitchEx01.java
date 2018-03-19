package com.javaex.language.condition;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건분기
//				if (code == 1) {
//					System.out.println("R101입니다.");
//				} else if (code == 2) {
//					System.out.println("R202입니다.");
//				} else if (code == 3) {
//					System.out.println("R303입니다.");
//				} else if (code == 4) {
//					System.out.println("R404입니다.");
//				} else {
//					System.out.println("관리자에게 문의하세요");
//				}
		// 코드 입력받기
		
		System.out.println("과목을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		
		//	조건 분기
		switch(code) {
		case 1:
			System.out.println("R101입니다.");
			break;	//	중요
		case 2:
			System.out.println("R202입니다.");
			break;
		case 3:
			System.out.println("R303입니다.");
			break;
		case 4:
			System.out.println("R404입니다.");
			break;
		default:
			System.out.println("관리자에게 문의하세요.");
		}
		
		sc.close();
	}

}
