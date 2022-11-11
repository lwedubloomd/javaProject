package com.yedam.java.chapter0703;

public class Application {
	public static void main(String[] args) {

		// 추상 클래스는 자신을 객체화(인스턴스화) 할 수 없다.
		// Phone phone = new Phone("아이폰") -> 일케 하면 만들 수 없음

		//SmartPhone smartPhone= new SmartPhone("고길동");

		//smartPhone.turnOn();
		//smartPhone.internetSearch();
		//smartPhone.turnOff();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------------------------");
		
		Animal animal = null;
		
		animal = new Dog();
		dog.sound();
		dog.breathe();
		
		animal = new Cat();
		cat.sound();
		
		System.out.println("---------------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}

		public static void animalSound(Animal animal) {
			animal.sound();
		}

}

