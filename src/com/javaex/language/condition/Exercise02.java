package com.javaex.language.condition;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//	점수 입력
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade;
		//	등급 판별
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		//	출력
		System.out.println(grade + "등급");
		sc.close();
	}

}
