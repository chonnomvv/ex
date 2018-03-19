package com.javaex.language.condition;

public class MiniLotto {

	public static void main(String[] args) {
		//	while문 버전
		int i = 0;
		while( i < 6) {
			int rnd = (int)(Math.random() * 45) + 1;
			System.out.print(rnd + " ");
//			System.out.println(x);
			i++;
		}
		System.out.println();
		
		for (int x = 0; x < 6; x++) {
			int rnd = (int)(Math.random() * 45) + 1;
			System.out.print(rnd + " ");
		}
		System.out.println();
	}

}
