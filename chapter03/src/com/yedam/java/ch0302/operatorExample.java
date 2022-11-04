package com.yedam.java.ch0302;

public class operatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//브호연산자 "="는 대입연산자 오른쪽 값을 a에 대입하겠다
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
	
		byte b = 100;
		//●byte result3 = (byte)-b;  //byte값으로 받고 싶으면 앞에 케스팅 괄호 해줘라  // (byte)-b
		int result3 = -b; //●처럼 안하면 이거처럼 해라~
		System.out.println("result3 :" + result3);  //ctrl F11;
	}

}
