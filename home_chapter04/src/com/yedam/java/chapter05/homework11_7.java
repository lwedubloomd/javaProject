package com.yedam.java.chapter05;

public class homework11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 p.160
		 
		 2) 
		 for문을 이용해 1~100까지의 정수 중에서 
		 3의 배수의 총합을 구하는 코드를 작성해 보새요
		 */
		int total = 0;
		for(int i=0; i<=100; i++) {
			if (i%3 == 0) {
				total += i;
			}
		}
		System.out.println("3의 배수의 합 :"+total);
		
		/*
		 3)
		 while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 출력,
		 눈의 합이 5가 아니면 계속 주사위를 던지고
		 눈의 합이 5면 실행을 멈추는 코드를 작성
		 */
		System.out.println("-----------------------------------");
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			System.out.printf("%d, %d\n",a,b);
		if(a+b == 5) {
			break;
			}
		
		}
		
		/*
		 4)
		 중첩 for문을 이용해서 방정식 4x + 5y = 60의 모든 해를 구하고 
		 (x,y)형태로 출력 *x,y는 10이하의 자연수 
		 */
		System.out.println("-----------------------------------");
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println(x+","+y);
				}
			}
		}
		
		/*
		 5-6)
		 별출력 1~4 공백있는것도 해보기
		 */
		System.out.println("-----------------------------------");
		
		String star="";
		for(int i=1; i<=4; i++) {
			star+="*";
			System.out.println(star);
		}
		System.out.println("-----------------------------------");
		
		for(int i=1; i<=4;i++) {		//1234
		for(int j=4;j>0 ;j--) {		//321
		if( i < j){
		System.out.printf(" ");
		}else {
			System.out.printf("*");
				}
			}
		System.out.println();
		}
		/*
		 while문과 Scanner 이용 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를
		 */
		 
	}

}
