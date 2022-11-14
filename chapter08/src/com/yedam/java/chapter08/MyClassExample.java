package com.yedam.java.chapter08;

public class MyClassExample {
	public static void main(String[] args) {

		System.out.println("1)-----");	//p.380 exbox
		
		//여기 rc는 MyClass클래스의 RemoteControl rc = new Audio();를 뜻함
		MyClass mc = new MyClass();
		mc.rc.turnOn();//..이거 두개 들어가는디 mc안에 remote어쩌구 rc안에 내용
		mc.rc.turnOff();
		
		
		System.out.println("2)-----");
		//RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc.turnOn();
		//rc.turnOff();

		
		System.out.println("3)-----");
		//RemoteControl rc = new Audio();
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn();
		//rc.turnOff();

		System.out.println("4)-------");
		//RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
	
	}
}
