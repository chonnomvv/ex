package com.javaex.language.reftypes;

public class StringEx02 {

	public static void main(String[] args) {
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		//	총 10개의 사과 중 3개 먹었다
		System.out.println("총 " + total + "개의"
				+ fruit + "중에 " + eat + "개를 먹었다.");
		String result = String.format(
				"총 %d개의 %s 중에 %d개를 먹었다", 
				total,
				fruit,
				eat);
		System.out.println(result);
		System.out.printf("총 %d개의 %s 중에 %d개를 먹었다%n", 
				total,
				fruit,
				eat);
	}

}
