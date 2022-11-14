package com.yedam.java.chapter08;

public class MyClass {

	
	//필드
	//1)
	//public int a = 1; 이런거 말고도 참조타입도 넣을 수 잇어요
	RemoteControl rc = new Television();
	
	//생성자
	public MyClass() {}
	
	
	public MyClass(RemoteControl rc) {//생성자 오버로딩//생성자 이름 같아도 매개변수에 어쩌구에 따라서 머 같이 쓸 수 잇엄~
		this.rc= rc; //머 대충 끌어와서 같이 쓸 수 잇어 편하다....
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
