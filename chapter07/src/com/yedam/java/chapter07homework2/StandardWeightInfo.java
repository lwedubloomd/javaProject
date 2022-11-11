package com.yedam.java.chapter07homework2;

public class StandardWeightInfo extends Human{

	
	
	
	
	
	
	//이름, 키, 몸무게와 비만도를 출력하는 기능
	public void getInformation() {
			System.out.printf("%s님의 신장 %d, 몸무게 %d, 비만도 : %d",Human.name,Human.height,Human.weight,getObesity());
		}
	
	public double getObesity() {
		double resultB = (Human.weight - Human.getStandardWeight())/Human.getStandardWeight() * 100;
	}
}

