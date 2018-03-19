package com.javaex.language.condition;

public class SwitchEx03 {

	public static void main(String[] args) {
		String day = "DAY";
		String act;
		
		switch(day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "불금";
			break;
		default:
			act = "여긴 어디야?";
		}
		System.out.println(act);
	}

}
