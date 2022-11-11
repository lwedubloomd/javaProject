package com.yedam.java.chapter0701;

import com.yedam.java.chapter07.Parent;

public class Child2 extends Parent{

//필드
	//생성자
	//메소드

	
	void getInfo() {  	//오류나는 것과 안나는 거... firsttName age 이거는 디폴트 타입이라.?
						//(디폴트:타입 변수; 의 형태) 
						//protected이거 사용하면 가넝함~(다른 패키지 사용 법임...)
						//public도 가넝~
		System.out.println(firstName + lastName + booldType + age);
	}
}
