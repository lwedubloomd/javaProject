package com.yedam.java.ch0601;

public class ConstantNo {
	
	//필드
	static final double PI = 3.14;		//static은 전역엥서 쓸 수 있는 것 final은 고정~
	static final int EARTH_ROUND = 46250;		//변수 선언할 때 final 들어가면 전부 다 대문자 써야행
	static final int LIGHT_SPEED = 127000;		//이 경우 단어 구분은 언더바(_)로 하세용
	
	String words = "This is Java";
	char word = 'Y';
	//생성자
	
	//메소드
	//static 멤버의 사용 범위(scope)
	
	//static 메소드
	static void getCircle(int radius) {
		//pi *r*r 원 넓이
		System.out.println("원 넓이 :"+ (pi*radius*radius));//파이라는 static 필드가 
									//정적으로 머 시기 어쩌구 되기 때문에..머....쓸 수 잇다...
	}
	
	
	//메소드에 static 필드 호출		//평범한 메소드지만 static을 사용할 수 잇다,
								//static은 어느 영역에서도 사용할 수 잇기 때문이당...
	public void allData() {
		double result = pi + earthRound + lightSpeed;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
		//String getWord = word + String.valueOf(word);		//String.valueof는 머고,,,?
		//↑↑↑↑이거 오류나는데 어케 해결할거냐~~
		//main class에다가 인스턴스화 해서 써라
	}
}
