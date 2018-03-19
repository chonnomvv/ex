package com.javaex.basicapi.objectclass.clone_solution;

public class CloneTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		//	이 포인트 객체를 원본으로 두고 다른 포인트로 가져온다고 가정
		System.out.println("p = " + p);
		Point p2 = p.getClone();	//	복제
		System.out.println("p2 = " + p2);
		
		p2.setX(20);
		p2.setY(20);
		
		System.out.println("p2 = " + p2);
		System.out.println("p = " + p);
		

	}

}
