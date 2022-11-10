package com.yedam.java.ch06예제;

import com.yedam.java.example.Bank_my;

public class Customer_my {
	// 필드

	String name;
	String bank;
	// 계좌
	int account;
	// 잔액
	static int money;

	// 금리
	static double interRate = 3.0;

	// 생성자
	public Customer_my(String name, String bank, int account, int money) {
		this.name = name;
		this.bank = bank;
		this.account = account;
		this.money = money;
	}

	// 메소드
	void getInfo() {
		System.out.println("== 입력 하신 회원 정보 ==");
		System.out.println("이름 :" + name);
		System.out.println("은행 :" + bank);
		System.out.println("계좌 :" + account);
		System.out.println("잔액 :" + money);
	}

	void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금 하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 :" + money);
		System.out.println("금리 :" + Bank.interRate + "%");
		System.out.println("예상금액 :" + money + (money * Bank.interRate));
	}
}
