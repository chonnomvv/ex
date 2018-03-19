package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy");
		Animal cat1 = new Cat("Garfield");
		
		dog1.eat();
		cat1.eat();
		
		dog1.walk();
		cat1.walk();
		
//		dog1.bark(); // 안됨
		
		Dog dog2 = (Dog)dog1;
		dog2.bark();
		
		((Dog)dog1).bark();
		((Cat)cat1).meow();
		
		Animal pet = new Dog("Azi");
		pet = new Cat("Nyang");
		
//		((Dog)pet).bark();
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}

	}

}
