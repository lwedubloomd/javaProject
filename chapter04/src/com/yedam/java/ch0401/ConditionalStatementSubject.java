package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개의 정수가 주어졌을 때
		//두 정수으 ㅣ합이 자연수이면
		//natural number를 출력하는 코드
		
		int num1 =-1;
		int num2 = 10 ;
		
		if (num1 + num2 > 0) {
			System.out.println("Natural Number");
		}
		
		//두개의 정수가 주어졌얼 때
		//두서의 대소관계에 따라 부등호르르 출력하는 코드
		
		int a = 3, b = 5;
		
		
		if (a > b) {
			System.out.println(">");
		}else if (a == b){
			System.out.println("=");
		}else {
			System.out.println("<");
		}
		
		//문제3 체질량 지수 BMI 따라 비만도를 네가지 단계로 구분
		//BMI 체중/(키 * 키)(m기준)
		//저체중 18.5
		//정상 18.5이상 25미만
		//과체중 25이상 30미만
		//비만 30이상
		
		
		double g = 80;
		double h = 170;
		double bmi = g  /( h/100 * h/100);
		
		if(bmi > 18.5) {
			System.out.println("저체중");
			}else if(bmi >= 18.5 && bmi < 25) {
				System.out.println("정상");
			}else if(bmi >= 25 && bmi < 30) {
				System.out.println("과체중");
			}else {
				System.out.println("비만");
			}
		
		//선택한 단의 6번째 값을 출력하는 코드
		//예를 들어 2단일 경우 2*6 =12
		//단, 출력문에는 변수를 사용하지 않는다
		
		
		//구구단
		
		/*int aa = 2;
		int value = aa*6;
		
		
		switch(aa){
		case 1:
			System.out.println(1*6);
			break;
		case 2:
			System.out.println(2*6);
			break;
		case 3:
			System.out.println(3*6);
			break;
		case 4:
			System.out.println(4*6);
			break;
		default :
			System.out.println("*6을 하세영~");
		*/
			
		//교수님하싱거
		
		int dan = (int)(Math.random() * 9) + 1;
		
		switch(dan) {
		case 1:
			System.out.printf("%d x 6 = %d\n", 1 ,1*6);
			break;
		case 2:
			System.out.printf("%d x 6 = %d\n", 2 ,2*6);
			break;
		case 3:
			System.out.printf("%d x 6 = %d\n", 3 ,3*6);
			break;
		case 4:
			System.out.printf("%d x 6 = %d\n", 4 ,4*6);
			break;
		case 5:
			System.out.printf("%d x 6 = %d\n", 5 ,5*6);
			break;
		case 6:
			System.out.printf("%d x 6 = %d\n", 6 ,6*6);
			break;
		case 7:
			System.out.printf("%d x 6 = %d\n", 7 ,7*6);
			break;
		case 8:
			System.out.printf("%d x 6 = %d\n", 8 ,8*6);
			break;
		case 9:
			System.out.printf("%d x 6 = %d\n", 9 ,9*6);
			break;
			
			
		//문제 범위에따라 등금 구분
			//90이상100이하 A
			//80이상 90미만 B
			//70이상 80미만 C
			//60이상 70미만 D
			//60미만 E
			
			double sco = 86;
			//double ss = sco 
			
			switch(int(sco/10)) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			case 5:
				System.out.println("E");
				break;
			
			}
		}
	}
}
