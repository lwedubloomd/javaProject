package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p161-5
		//for문 이용
		
		String star=" ";
		for(int i=1; i<=5; i++) {
			star+="*";  //<-여기서 star="*";일케 햇엇는데 star += "*";이래해야함
			//star+=i; <-이거 넣어서 틀림 ㅜㅜㅠ
		
		System.out.println(star);
		}
		
		for(int i=1; i<=5; i++) { 	//line
			for(int j=1; j<=i; j++) {	//"*"줄바꿈
				System.out.println("*");
			}
			System.out.println();
		}
		
		//for문 이용 1~100정수 중 
		//2의 배수가 아닌 숫자의 개수
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) { 
				continue;
			}
			count ++;
		}
		System.out.println(count);
		
		
		
		//p.161 4
		//중첩 for문을 이용해 방정식 4x + 5y =60 모든 해를 구해서 (x,y)형태로 츌룍 중 첫번째
		
		 for(int x =0; x <=10; x++) {
			for(int y =0; y <= 10; y++) {
				if(4*x + 5*y == 60) {             //☜☜일케 해야한대 if(4x + 5y = 60)난 이렇게 햇음 
					System.out.println(x +","+ y);
					break;
					}//☜☜일케 하면 5,8 //10,4 답 이렇게 두개 나옴
				}
			}
		 
		 outter:for(int x =0; x <=10; x++) {
				for(int y =0; y <= 10; y++) {
					if(4*x + 5*y == 60) {            
						System.out.println(x +","+ y);
						break outter; 
						}  //☜☜일케 하면 답 나옹
					}
				}
		//문제4 do~while문과 Math.random()함수를 이용
		 // 1~10의 정수 중 7이라는 수가 나올 때 까지 숫자를 출력
		
		 /*
		 do { 
			if x == 7{
			System.out.println(x);}
		 }while(int)(Math.random()*10)+1;
		 
		 int num = (int)(Math.random()*10)+1;
		 
		 while(num !=7) {
			 num = (int)(Math.random()*10)+1;
			 System.out.println(num);
		 }
		 */
		 int num=0;
		 do {
			 num=(int)(Math.random()*10)+1;
			 System.out.println(num);
		 }while(num==7);
		 
		 //while문 주사위 Math.random~~~
		 //최종으로 주사위를 몇번 던졌는지 횟수 출력
		 //숫자의 합이 5가 되는 조합
		System.out.println("----------------------------");
		/*
	
		 int bcount = 0;
		 while (true) {
			 aa=(int)(Math.random()*6)+1;
			 bb=(int)(Math.random()*6)+1;
			 System.out.printf("(%d,%d)\n","aa,bb);
			 bcount++;
			 if(aa + bb == 5) { 
			
				 break;
			 }
		 }
		 System.out.println(bcount);
		 */
		int total = 0;
		while(true) {
			int x =(int)(Math.random()*6)+1;
			int y=(int)(Math.random()*6)+1;
			total++;
			System.out.printf("(%1$d눈, %2$d눈)\n",x,y);
			if(x+y == 5) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총"+ total +"번 입니다.``");
		}
	}
