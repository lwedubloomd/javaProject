package com.yedam.java.ch0601;

public class Game {

	// 필드
	//객체로 만든다(인스턴스화 된다)
	//인스턴스 필드?
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;

	// 생성자
	public Game() {		//생성자는 같은 이름이로 여러개 있어도 된다, 
						//매개변수를 달리 해야햄ㅋ타입 개수..그럼 다른 생성자라고 인식함. => 오버로딩이라고 한다
	
	}
	public Game(String id) {
		this.id = id;
	}
	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}
	
	// 메소드(함수)			//얘도 오버로딩이 잇다...
	//인스턴스 메소드     //인스턴스필드+인스턴스 메소드=>인스턴스멤버
	public void getInfo() {
		System.out.println("GameName: "+gameName);
		System.out.println("server: "+server);
		System.out.println("id: "+id);
		System.out.println("passWd: "+passWd);
	}
	void getInfo(String temp) {
		
	}
}
