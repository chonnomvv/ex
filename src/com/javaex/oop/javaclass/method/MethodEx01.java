package com.javaex.oop.javaclass.method;

public class MethodEx01 {

	public static void main(String[] args) {
		//	매개변수 x, 리턴값 없는 메서드
		printMessage();
		
		//	반환값이 있는 메서드의 경우
		double result = square(3.5);
		System.out.println("3.5의 제곱: " + result);
		
		//	반환값은 없으나 return을 사용하는 메서드
		printDiv(10, 5);
		printDiv(10, 0);
	}
	
	static void printDiv(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("정수는 0으로 나눌 수 없음.");
			return;
		}
		System.out.println(num1 / num2);
	}
	
	static double square(double num) {
		return num * num;
	}
	
	static void printMessage() {
		System.out.println("Message");
	}
	
	

}
