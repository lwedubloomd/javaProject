package com.yedam.java.chapter0701;

public class Student {

	
	//메소드
	public void setScore() {
		System.out.println("성적을 입력합니다");
	}
	public final void getScore() {
		System.out.println("성적을 출력합니다");		//자식클래스 people 에서 못 씀
	}
	
}
