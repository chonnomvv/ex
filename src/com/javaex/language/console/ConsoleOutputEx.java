package com.javaex.language.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		//	간단한 출력
		System.out.print("Hello");
		System.out.println(", Java");
		
		System.out.println("Hello" + "," + "Java");
		System.out.println("Number " + 1);
		
		//	이스케이프 문자 (\)
		System.out.println("Hello, \nJava");
		System.out.println("Hello, \tJava");
		System.out.println("Hello, \"Java\"");
		System.out.println("\\");

	}

}
