package com.yedam.java.ch06예제;

import com.yedam.java.ch0601.ConstantNo;
import com.yedam.java.ch0601.Shoes;

public class Application {
	
	//필드
	int staticTest = 0;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application ap = new Application(); //내 자신을 인스턴스화 하는 것 Application 은 이거 파일명임
		
		ap.staticTest = 2;
		
		Shoes shoes = new Shoes();
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.words);//인스턴스화 해서 써라
		
		System.out.println(ConstantNo.EARTH_ROUND);
		
		//은행 고객 정보를 관리하는 클래서
		//1) main 2) Customer 3) Bank
		//1) main => 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당 은행의 금리를 저장
		//	(현재 잔액+(현재 잔액* 금리))
		//3) Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액의 필드
		//getInfo() : 입력한 정보 출력
		//withDraw() : 출금 할 때 정보를 출력
		
		Member mem = new Member();
		
		//1)mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println(mem.setId());
		System.out.println(mem.setTel());
		System.out.println(mem.setAge());
	}

}
