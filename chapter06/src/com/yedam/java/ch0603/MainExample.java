package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("모닝", "하늘색");

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);

		Car newCar = new Car(); // intstance를 만들기 위해서 필수적으로 채워준건데,,,
		// 여기서 오 류뜨는 이유는 이미 생성자가 있어서 생성자를 java가 만들어 줄 수 없음..
		// 클래스 어디에도 생성자가 없을때만 자바가 자동으로 생성자를 만들어준당.!@@!

		System.out.println("제작회사 : " + newCar.company);
		System.out.println("모델명 : " + newCar.model);
		System.out.println("색깔 : " + newCar.color);

		Car subCar = new Car("아이오닉", "하얀색");
		System.out.println("제작회사 : " + subCar.company);
		System.out.println("모델명 : " + subCar.model);
		System.out.println("색깔 : " + subCar.color);

	}
}
