package com.javaex.language.condition;

public class LoopEx02 {

	public static void main(String[] args) {
		//	열을 돌립시다
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
