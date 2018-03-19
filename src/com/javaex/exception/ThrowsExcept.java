package com.javaex.exception;

public class ThrowsExcept {
	//	예외 던지는 메서드
	public void executeExcept() {
		System.out.println("강제 예외 발생");
		RuntimeException e = new RuntimeException("Too cold");
		throw e;
	}
}
