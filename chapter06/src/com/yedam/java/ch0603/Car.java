package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color ="검정";
	int maxSpeed = 350;
	int speed;
//this.speed이지랄로 하면은 오류 백빱ㅇ뜸
	
	
	public Car(String model) {
	this(model, "은색", 250);
	}
	//생성자		//▽▽▽얘는 매개변수
	public Car(String model, String color) {
		//this.model = model; //여기에서는 필드도 model 매개변수로 넘어오는 것도 ~model  
				//this.을 붙임으로서 인스턴스를 머 어쩌구저쩌구,,,
		//this.color = color;
	this.company ="웨스턴";
	this(model,color, 250);/////////////this면 인스턴스 괄호잇음 생성자
							//없으면 머시기  이름도 괄호도 잇음 메소드

	
	}
	public Car(String model) {
		//this.color = color;
		
	}
	
	public Car(String model,String color, int maxSpeed) {
		//this.model = model;
		this(model,color,250);
	}
}
