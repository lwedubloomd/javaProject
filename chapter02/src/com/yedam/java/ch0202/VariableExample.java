package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte타입 정수형이라 소수점 X
		byte var1 = -128; //byte타입의 최소값
		byte var2 = 127; //byte타입의 최대값
		//byte var3 = 128; //사이 값 아니면 오류남
		System.out.println(var1+","+var2);
		
		/* 이게 오류나는 이유는 자바에서 정수형은 int로 보는데
		100000~ 부터 인식하기 때문에 오류 남,,,
		int 범위 넘어서는 리터럴 입력할 땐 L을 붙여줘야 한다
		소문자를 사용해도 가능하지만,,,가독성 위해 대문자로 쓰삼~~~*/
		//long var6 = 10000000000000;
		long var6 = 10000000000000L; //int 값 벗어나는 값만 L붙임
		long var7 = 1000000; 
		
		//char 타입
		char v1 = 'A'; //''홀따옴표 써야한다 한글자만 가능 문자X
		char v2 = '가';
		int v3 = v1;//값이 65인데 이거는 A의 
		char v4 = 65;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		
		//string  //문자열 이용시에는 독립된 ? 암튼 String써라~
		String name = "홍길동"; ///''문자 리터럴 ///""문자열 리터럴
		System.out.println(name);
		System.out.println(name.length());
		
		String job = "프로그래머";
		System.out.println(job.charAt(3));
		System.out.println(job.length());
		
		//char VS String
		char v5 = 'A';  //한글자만 넣어야하는데 두글자라 유니코드에 없는 값이라 오류남.
						 //공백도 같음""큰 따옴표 써도 안됨
		String v6 ="";  //한글자든, 아니든 공백이든 상관은 없는데 ''만 안쓰면 됨
		
		/*String str1 = "누군가 "안녕"하면서 인사했다.";같은 경우는
		오류 나기땜에 역슬래시 같이 쓰면 쓰는거 가넝~*/
		String str1 = "누군가 \"안녕\"하면서 인사했다.";
		
		//float
		float num1 = 3.14F;			//float은 F를 붙여야 한다
		double num2 = 3.14;			//범위는 같음 정확하게 쓸려면 이거 써라
		
		float varF = 0.1234567890123456789F;  
		double varD = 0.1234567890123456789;  //기준은 double.
											  //float 쓸러면 뒤에 F 붙여라
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		boolean stop = true;
		if(stop) {
			System.out.println("중지");
		}else {
			System.out.println("시작");
		}
	}
	

	
	
	
	
	
	
	
	
}
