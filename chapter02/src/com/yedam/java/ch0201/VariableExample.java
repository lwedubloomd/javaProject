package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		//한 줄 주석   /* */여러줄 주석
		int value1 = 15;
		
		if(value1 > 10 ) {
			int value2; //여기 value2의 변수는 중괄호가 닫히는 시점에 끝남
			value2 =  value1 - 10;
		}                   //얘 오류 뜬 이유 변수 문제 잇는것(여기선 위치)
		int result = value1 + value2 + 5;
		
		System.out.println(value1+"," + value2+"," + result);
	
		/***/
		
		int v1 = 0;
		v1 = 1;
		int v2 = 0;
		if(v2 == 0) {
			v2 = 2;
			int v3 = v1 + v2;
			System.out.println(v1+","+ v2+"="+ v3)
		}
		System.out.println(v1+","+ v2+"="+ v3)
	}
	System.out.println(v1+","+ v2+"="+ v3)
}
