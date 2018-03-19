package com.javaex.basicapi.objectclass.deepclone_solution;

public class CloneTest {

	public static void main(String[] args) {
		//	Scoreboard 하나 만들기
		Scoreboard sb1 = new Scoreboard(new int[] 
				{10, 20, 30, 40}
				);
		System.out.println("sb1:" + sb1);
		
		//	Scoreboard의 복제
		Scoreboard sb2 = (Scoreboard)sb1.getClone();
		System.out.println("sb2:" + sb2);
		
		sb2.getScores()[1] = 50;
		System.out.println("sb2:" + sb2);
		
		//	원본 체크
		System.out.println("sb1:" + sb1);
	}

}
