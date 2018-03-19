package com.javaex.language.condition;

public class SwitchEx02 {

	public static void main(String[] args) {
		char grade = 'E';
		String message;
		
		switch(grade) {
		case 'A':
			message = "Excellent!";
			break;
		case 'B':
		case 'C':
			message = "Good";
			break;
		case 'D':
			message = "Pass";
			break;
		case 'F':
			message = "Try Again!";
			break;
		default:
			message = "?";
		}
		System.out.println(message);

	}

}
