package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("입력값 :" + args[0]); //run as -> run configuration 의 
													//argument에서값을 주면 된다 
													//첫째값 둘째값 사이에  space bar로 구분
			
			if(args.length !=2) {
				System.out.println("값의 수가 부족합니다.");
				System.exit(0);
			}//원하는 값이 없더라도 ~ 
			String strNum1 = args[0];
			String strNum2 = args[1];
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int result = num1 + num2;
			System.out.println(num1+"+"+ num2+"="+ result);
	}

}
