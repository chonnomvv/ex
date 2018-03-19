package com.javaex.oop.javaclass.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		//	클래스명 이름 = new 클래스명();
		Goods camera = new Goods("Nikon", 400000);
//		camera.name = "Nikon";
//		camera.price = 400000;
		
		//	출력
		camera.showInfo();
		
		Goods iphone = new Goods("아이폰", 10000000);
		
		Goods galaxy = new Goods("갤럭시 S8", 100000);
		
		iphone.showInfo();
		galaxy.showInfo();
	}

}
