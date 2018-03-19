package com.javaex.exception;

public class ThrowsExceptApp {

	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
		try {
			except.executeExcept();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
