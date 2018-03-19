package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		int[] intArray = new int[] { 3, 6, 9 };
		try {	//	시도
			intArray[3] = 12;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}

	}

}
