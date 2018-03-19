package com.javaex.language.reftypes;

public class EnumEx01 {

	public static void main(String[] args) {
		//	요일 지정
		Week day = Week.MONDAY;
		//	activity 
		String activity;
		
		//	switch를 이용, 요일별 activity를 세팅
		switch(day) {
		case SUNDAY:
			activity = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			activity = "열공";
			break;
		case FRIDAY:
			activity = "불금";
			break;
		case SATURDAY:
			activity = "주말";
			break;
		default:
			activity = "?";
		}
		System.out.println(activity);
		//	activity를 출력
		
		
		
		
		
		
	}

}
