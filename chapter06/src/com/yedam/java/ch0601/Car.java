package com.yedam.java.ch0601;

public class Car {
	
	/*
	실행클래스와 라이브러리클래스의 차이점은 메인이 없다.
	public static void main(String[] args)
	*/

		//필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	//생성자
	public Car() {		//생성자는 본인의 이름 가질 수 없음. 클래스 이름으로 존재한다
		System.out.println("자동차가 출하되었습니다.");
	}
	//메소드 : 동작
	public void run() {			//리턴하는 값이 존재
		System.out.println("자동차가 동작 중 입니다.");
	}
	}


