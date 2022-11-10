package com.yedam.java.ch0601;

public class SmartPhone {
		
	//필드
	//해당 클래스의 속성(정보) 저장하는 구간
	String name;
	String maker;
	int price;
	//생성자
	
	//메소드
	void call() {		//기능을 추가할거임,, 전화 걸고 끊는 기능
						//정의를 해놓고 메인문에서 어쩌구 저쩌구 해라
		System.out.println(name + "전화를 겁니다");
	}
	
	void hangUp() {
		System.out.println(name+ "전화를 끊습니다");
	}
	
}
