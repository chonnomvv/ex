package com.javaex.exception;

public class NullExceptionEx {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		str = null;
		try {
			str.concat("Java");
		} catch (NullPointerException e) {
			System.out.println("객체 str은 null입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
