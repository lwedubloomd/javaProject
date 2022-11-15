package com.yedam.java.chapter11;

public class BoxingUnboxing {
	
	public static void main(String[] args) {

		
		//박싱
		
		
		//1)생성자를 사용한 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		
		//2)생성자를 사용하지 않는 박싱
		Integer obj3 = Integer.valueOf("300");
	
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
	
		System.out.println(value1+value2+value3);
		System.out.println(value2);
		System.out.println(value3);
		
		
		//자동박싱
		Integer obj4 = 100;
		
		//자동언박싱
		int value4 = obj4;
		int value5 = obj4.intValue();
		
		//타입변환
		int value6 = Integer.parseInt("777");
		double value7 = Double.parseDouble("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		//포장값
		Integer obj10 =300;
		Integer obj11 =300;
		System.out.println(obj10==obj11);//false가 결과로 나오는데  값을 범위안에꺼를 하면은 제대로 나온다
										//100일땐 true,,,300일 땐 false
	}
}
