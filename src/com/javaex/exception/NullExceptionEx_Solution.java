package com.javaex.exception;

public class NullExceptionEx_Solution {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		str = null;
		
		str.concat("Java");

	}

}
