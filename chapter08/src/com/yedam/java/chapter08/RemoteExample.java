package com.yedam.java.chapter08;

public class RemoteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TV를 객체로 해서 만들었는ㄷㅣ
		RemoteControl rc = new Television();
		
		 	//일케 하면은 TV를 덮어씌움..그래서 출력하면은 오디오로 출력된다
		//rc= new Audio();
			//상속을 두가지 받앗는디 객체가 또다른 생성이 아니라 TV에서 Audio로 변경되는거당~
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		//다중 인터페이스 구현 덧붙임내용
		Search search = new Television();
		
		search.search("google.com");
		//search. 하면은 search 어쩌구 method만 사용할 수 잇움 
		//여러가지 인터페이스 만드는건 조은데
		//정의해 놓은 인터페이스 불러와서 해야한당?????????????? 몬말이고..........
		
		
		//쓰기, 읽기, 리스트 조회기능이 있는디
		//프로젝트 하면은 같은기능이면 인터페이스 해서 같이써랑~
		
	
//		Television tv = new Television();
//		
//		tv.turnOn();
//		tv.setVolume(11);
//		tv.turnOff();
		
		//똑같은 내용을 어쩌구면은 인터페이스를 어쩌구 ~
		
	/*
	 public static void(RemoteControl rc){}
	 public static void(Television tv){} 
	 하나의 객체로 다양한 객체를 만들 수 잇음...(?) 
	 대충 편의 용이성 이런거 말하는 듯...?
	 */
		
		//추상클래스 vs 인터페이스
		//★★// 추상클래스 -> 필드, 생성자, 메소드
		//★★//인터페이스 (implements)-> 상수,추상메소드(기능 위주로 쓰겓다...ㄷㄷ)
		//인터페이스랑 추상클래스 차이점을 알어라
		//생성자가 없음..즉 바로 구현클래스로 쓴다 부모클래스 메모리 쓰지 않고 만든당
		
		
		//부모자식클래스가 아니라 구현클래스 잇으면은 내가 원하는 기능을 계쏙 붙일 수 잇음//▽▼▽ 이런 식으로
		//public class RemoteExample implements remoteControl, WashingMachine{
	}

}
