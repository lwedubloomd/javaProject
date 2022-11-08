package com.yedam.java.ch0402;

import java.util.Scanner;
public class BankPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				// 메뉴 : 예금
				System.out.print("예금액>");  //잔액 위에 얹히는거,, +해야해 누적~~~~~
				int money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
			}else if(selectNo == 2) {
				// 메뉴 : 출금	
				System.out.print("출금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			}else if(selectNo == 3) {
				//메뉴 : 잔고
				System.out.print("잔고>" + balance);
			}else if(selectNo == 4) {
				//메뉴 : 종료
				run = false;
				//이미 변수 설정해서, 변수 써서 false박아주면 된다. 그치만
				//switch문 쓰면~가넝~~
			}else {
				//기타입력
				System.out.println("정해진 메뉴 중에서 선택해 주세요");
			}
			}
		System.out.println("프로그램 종료");
	}

}
