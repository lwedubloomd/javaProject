package com.yedam.java.ch06예제;

import java.util.Scanner;


public class Application7_my {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//import불러오는 법 crtl+shift+o
		String confirm;

		Customer_my customer = new Customer_my("고길동", "농협", 123456888, 1000000);

		customer.getInfo();

		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");

		confirm = sc.nextLine();//머고..
		if (confirm.toLowerCase().equals("y")) {//이게머고....

			System.out.println("출금 완료");

		} else {
			System.out.println("시스템 종료");
		}
		
		Access access = new Access();

		//1)public
		access.free = "public";
		//2)private
		//access.privacy = "privacy";그냥 쓰면 오류 뚬 ㅋ//privacy로 접근제한 걸려서 오류뜨능거임 ㅎ
		//쓸려면은 클래스에 메소드에 privacy(); 이렇게 넣어서 쓰면댐 //여기서는 ○○○○○class Access에서 넣엇어.... 
		//3)protected
		access.parent = "parnet";
		//4)default
		access.basic = "basic";
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}
}
