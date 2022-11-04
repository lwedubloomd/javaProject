package com.yedam.java.ch0204;

import java.util.Scanner;

public class variableExample {
	public static void main(String[] args)  {
		int value =123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
	
		Scanner sc = new Scanner(System.in);
	//new는 생성자다 ctrl shift o 써서 scanner 패키지 정하고 import해야해 
	
	/*String str = sc.nextLine();// 입력하능거~
	System.out.println("입력 :"+ str);
	//println()  js의 console.log,,입력의 기능도 한다~*/
	
	/*	
	String str = sc.next();
	int var = sc.nextInt();//nextLine이랑 동시에 못씀 
						   //기준이 다르기땜에 ,,nextLine은 엔터까지 읽고
						   //nextInt이거는 엔터 몬읽음
	System.out.println("입력 :" +str +","+ var);
	*/
	
	/*
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println("입력 :" + (x+y));
	*/
	
	/*
	System.out.print("첫번째 :");
	String x = sc.nextLine();
	System.out.print("두번째 :");
	String y = sc.nextLine();
	int result = Integer.parseInt(x) + Integer.parseInt(y);
	System.out.println("결과 :"+ result);
	*/
		
		String inputData;//한문장씩 입력하는건 개아는데...
						 //한페이지를 다 쓸려면은,,,while문으로 해라~
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}	
}
