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
		
		//증감연산자
		int x = 10;
		int y = 10;
		int z; 
		System.out.println("----------------------------");
		x++;
		++x;
		System.out.println("x = :"+x);
		
		System.out.println("----------------------------");
		y--;
		--y;
		System.out.println("y = :"+y);
		
		
		System.out.println("----------------------------");
		z = x++;    //다른 연산이 먼저 실행된 후에 실행~ x가 가지고 있는 값을 먼저 대입한 후 ++하기
		System.out.println("z = :"+z); //result 12
		System.out.println("x = :"+x); //result 13
		
		
		System.out.println("----------------------------");
		z = ++x;    //
		System.out.println("z = :"+z); //result 14
		System.out.println("x = :"+x); //result 14
		
		System.out.println("----------------------------");
		z= ++x + y++;  //y8 x14       15 + 8(+)
		System.out.println("z = :"+z); //result 23
		System.out.println("x = :"+x); //result 15
		System.out.println("y = :"+y); //result 9
		
		/*
		1)++x => 15
		2)y++ =>9
		3)x + y => 15 + 8 => 23
		4) = => z =(x + y) => 23
		*/
		
		/***/
		 x=5;
		 y=5;
		 System.out.println("----------------------------");
		 z= x++ + --y;
		 System.out.println("z = :"+z); //result 9
		 System.out.println("x = :"+x); //result 6
		 System.out.println("y = :"+y); //result 4
		 
		 
		 System.out.println("----------------------------");
		 z= --x + y++;
		 System.out.println("z = :"+z); //result 9
		 System.out.println("x = :"+x); //result 5
		 System.out.println("y = :"+y); //result 5
		 
		 //논리 부정 연산자
		 boolean play = true;
		 play = !play;
		 System.out.println(play);
		 
		 play = !play;  //논리 부정 연산자는 앞에 붙어~
		 System.out.println(play);
		 
		 boolean isOpen = true;;
		 if(!isOpen) {						//if문이 가지는 값은 참,,, 
			 								//머 값을 가지는~parse 로 바꾸고 어쩌구 웅앵~
			 System.out.println("영업 시간이 종료되었습니다.");
		 }else {
			 System.out.println("영업 중 입니다.");
		 }
		 
		 //산술 연산자
		 int v1 = 5;
		 int v2 = 2;
		 int result;
		 
		 result = v1 + v2;
		 System.out.println("result :" + result);
		 
		 result = v1*v2;
		 System.out.println("result :" + result);
		
		 result = v1 /v2;
		 System.out.println("result :" + result);
		 
		 
		 //비교 연산자
		 int num1 = 10;
		 int num2 = 10;
		 boolean bResult;
		 
		 bResult =(num1 >=num2);
		 System.out.println(">= :" + bResult);	//result true
		 
		 bResult = (num1 == num2 );
		 System.out.println("== :" + bResult);	//result true
		
		 bResult = (num1 != num2 );
		 System.out.println("!= :" + bResult);	//false
		 
		 char char1 = 'A';
		 char char2 = 'B';
		 System.out.println("문자 비교 :" + (char1 > char2));
	
		 
		 int v3 = 1;
		 double v4 = 1.0;
		 System.out.println("int VS double :" +(v3 == v4));
		 
		 float v5 = 0.1F;
		 double v6 = 0.1;
		 System.out.println("float VS double :" + (v5 == v6)); //정밀도가 달라서 다름
		 System.out.println("v5 :" + (v5)); //사람이 보기에 같은 값인데 자바는 글케 생각 안함 ㅋ
		 System.out.println("v6 :" + (v6)); //정수는 상관 없음
		 System.out.println("float VS double :" + (v5 == (float)v6));
		 
		 
		 //논리 연산자
		 int charCode = 'A';
		 
		 //유니코드 중 65보다 크거나 같고 90보다는 작거나 같으면 대문자
		 if(charCode >= 65 && charCode <= 90) {				 //&나 && 둘 다 써도 상관 없음
			 System.out.println("대문자");
		 } 
		 
		 //유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		 if((charCode >= 97) & (charCode <= 122)) {				 //소문자 범위 97-122
			 System.out.println("대문자");
		 } 
		 
		 //유니코드 중 48보다 크고 57보다 작으면 숫자 0-9
		 if((charCode > 48) & (charCode < 57)) {
			 System.out.println("대문자");
		 }
		 
		 int numValue = 6;
		 if((numValue % 2 == 0) |(numValue % 3 == 0)) {
			 System.out.println("2 또는 3의 배수군요.");
		 }
		 if((numValue % 2 == 0)||(numValue % 3 == 0)) {
			 System.out.println("2 또는 3의 배수군요.");
		 }
		 
		 //복합 대입 연산자
		 int resultA = 0;
		
		 resultA += 10;
		 System.out.println("=+:"+resultA); //resultA = resultA + 10
		 
		 resultA -= 5;
		 System.out.println("-="+resultA); //5 resultA = resultA - 5
		 
		 resultA *= 3;
		 System.out.println("*="+resultA); //15
		
		 resultA /= 5;
		 System.out.println("/=:"+resultA); //3
		
		 resultA %=3;
		 System.out.println("%=:"+resultA); //0
		 
		 
		 //삼항연산자
		 int score = 95;
		 char grade = (score > 90) ? ('A') :('B') ;						// char grade = 변수 조건 ? true면 ~~ :false면 ~~ ;
		 System.out.printf("성적은 %d이고 등급은 %s \n", score, grade);   ///문자를 그대로 출력하고 싶음 c를 사용혀라~//println 이외에는 자동으로 줄바꿈 안되니까 \n를 해야한다 %s를 %c라고 해도 된다
		 
		 int age = 7;
		 String message = (age >= 20) ? "성인": "미성년" ;
		 System.out.printf("나이는 %d살 이며 %s입니다. \n",age, message);
	
	}

}
