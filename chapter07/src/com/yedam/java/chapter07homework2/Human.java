package com.yedam.java.chapter07homework2;

public class Human {

	static String name;
	static double height;
	static double weight;

	public Human(String name, double height, double weight) {
		this.name=name;
		this.height = height;
		this.weight = weight;
		}
		
		
		//메소드
	public void getInformation(){
			System.out.printf("%s님의 신장 %d, 몸무게 %d, 표준체중 : %d",name,height,weight,getStandardWeight());
		}
	
	public static double getStandardWeight() {
		double result = (height - 100) * 0.9;
		System.out.println(result);
		return result;
	
	}

}
