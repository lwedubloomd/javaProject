package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		//char charValue = VyteValue;
		int intValue = byteValue;
		System.out.println("intValue : "+ intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : "+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("charValue : "+ longValue);
		
		longValue = 50;
		float floatValue = longValue;
		System.out.println("longValue : "+ floatValue);
		
		floatValue = 100.5F;
		double doubleValue= floatValue;
		System.out.println("floatValue : "+ doubleValue);
		
		
		//강제 타입 변환
		intValue = 44032;
		//charValue = intValue;//유니코드 어떤걸로 바꿀 수 있냐를
							 //확인한느 어쩌구 하려면 해여허눙고
		charValue = (char) intValue;
		System.out.println(charValue);
		
		longValue=500; //long이 더 커서 ()써서 강제타입변환해야함
		//intValue = longValue;
		intValue = (int)longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);   //어쩔 수 없이 소숫점 이하는 
										//버릴 수 밖에 없음 ☆☆유의하세용
		
		
		
		//정수 타입 연산
		byte result = 10+20; //리터럴은 크게 신경쓰지 마세요
		byte x = 10;
		byte y = 20;
		//byte result2 = x+y; //이거 하면 오류나는데
							  //오류 나는 이유가 int타입이라,, 
							  //변수끼리는 계산 모데...
		int result2 = x+y;		//이런식으로 int형으로 바까주거나
		//byte result3 = (byte)(x+y);일케도 가능(강제변환)
		
		char charValue1='A';//65
		char charValue2=1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드 :" + intResult);
		System.out.println("출력문자 :" + (char)intResult);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		//int longResult = value1 + value2 + value3; 일케 하면 오류남
		long longResult = value1 + value2 + value3; //long이 있으니,,,일케 해야댐
										//int를 쓴다면 강제 변환~
										//혹시나 실수가 섞여있다면 double로~			
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1;
		
		
		int intVar1 = 10;
		//int resultVar1 = intVar1/4;
		//double resultVar1 = intVar1/4; //☆☆ //이거사용하면 주거도 2밖에 안나옴
		
		//2.5로 받아오려면 실수값을 넣어주ㅜ야함 
		double resultVar1 = intVar1/4.0; //위의 ☆☆을 이렇게 바까줌
		
		System.out.println("10/4 결과 :" + resultVar1);   //이거 값 2.0나옴
		//System.out.println("10/4 결과 :" + (intVar1/4));  //값 2
		
		int x1 = 1;
		int y1=2;
		double result1 = x1/y1;   //☆☆ 이거 사용하면 0.0
		//double result1 = (double)x1 / y1;  //☆☆ 이거 사용하면 0.5
						 //(double)이거 넣어준 이유가 하나 실수로 만들~
		System.out.println("1/2 결과 :"+ result1);
		
		
		//문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2+ "8";
		System.out.println(str1); //128 
		
		String str2 = 10 + "2"+ 8;
		System.out.println(str2); //1028 /10과 문자"2" 8 의 나열
		
		String str3 = "10" + 2+ 8;
		System.out.println(str3);//1028 /문자"10"과 2 8 의 나열
		
		/*String str4 = "10" + 2 + 8 ;
		System.out.println(str4);//이거를 바꾸려면 ▽밑에처럼▽*/
		String str4 = "10" + (2 + 8) ;
		System.out.println(str4);	//1010
		
		//기본타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("1");  //컴파일했을땐 빨간줄(오류)없음
												   //실행하면 오류남
		System.out.println("a :" + aVar);
		System.out.println("b :" + bVar);
		System.out.println("c :" + cVar);
		
		
		//☞☞☞요게 정석이랭~
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23;
		System.out.println(strV4);
		
		

	}
}
